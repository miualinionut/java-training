package clean.code.design_patterns.requirements.platform.dao;

import org.jetbrains.annotations.NotNull;
import clean.code.design_patterns.requirements.platform.pojo.Course;
import clean.code.design_patterns.requirements.platform.pojo.Teacher;
import clean.code.design_patterns.requirements.platform.util.AdminInterface;
import clean.code.design_patterns.requirements.platform.util.Dao;
import clean.code.design_patterns.requirements.platform.util.ELearningPlatformService;

import java.sql.*;

public final class CourseDao extends Dao {
    private static CourseDao courseDao;

    private CourseDao() {
        super();
        createUpdateProcedure();
    }

    private void createUpdateProcedure() {
        final String query = "CREATE OR REPLACE PROCEDURE updateCourseDesc (IN id1 INT, IN description1 VARCHAR(1024) ) " +
                "BEGIN " +
                "update Course " +
                "set description=description1 " +
                "where id=id1; " +
                "end";
        try {
            Statement statement = databaseConnection.createStatement();
            statement.execute(query);
        } catch (SQLException throwables) {
            auditCsvService.writeCsv("Exception in CourseDao.java: createUpdateProcedure: " + throwables);
        }

    }

    @Override
    protected void createTable() {
        final String query = "CREATE TABLE IF NOT EXISTS Course (\n" +
                "id INT PRIMARY KEY,\n" +
                "teacherId INT NOT NULL,\n" +
                "courseName VARCHAR(128) NOT NULL,\n" +
                "description VARCHAR(1024) NOT NULL,\n" +
                "FOREIGN KEY (teacherId) REFERENCES Teacher(id) ON DELETE RESTRICT)";

        try {
            Statement statement = databaseConnection.createStatement();
            statement.execute(query);
        } catch (SQLException throwables) {
            auditCsvService.writeCsv("Exception in CourseDao.java: createTable: " + throwables);
        }
    }

    static CourseDao getCourseDao() {
        if (courseDao == null)
            courseDao = new CourseDao();
        return courseDao;
    }

    public void writeCourse(Course course) {
        try {
            final String query = "INSERT INTO Course(id,teacherId, courseName, description) values(?,?,?,?)";
            PreparedStatement preparedStatement = databaseConnection.prepareStatement(query, Statement.NO_GENERATED_KEYS);
            preparedStatement.setInt(1, course.getId());
            preparedStatement.setInt(2, course.getTeacher().getId());
            preparedStatement.setString(3, course.getCourseName());
            preparedStatement.setString(4, course.getDescription());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            auditCsvService.writeCsv("Exception in CourseDao.java: writeCourse: " + throwables);
        }
    }

    public void deleteCourse(int courseId) {
        try {
            final String query = "DELETE FROM Course WHERE id=?";
            PreparedStatement preparedStatement = databaseConnection.prepareStatement(query, Statement.NO_GENERATED_KEYS);
            preparedStatement.setInt(1, courseId);
            preparedStatement.execute();

            AdminInterface.courses.remove(ELearningPlatformService.findCourseById(courseId));
            auditCsvService.writeCsv("course " + courseId + " deleted from database");
        } catch (SQLException | NullPointerException throwables) {
            auditCsvService.writeCsv("Exception in CourseDao.java: deleteCourse: " + throwables);
        }
    }

    public void updateCourseDescription(int id, @NotNull String desc) {
        try {
            final String query = "{call updateCourseDesc(?,?)}";
            CallableStatement callableStatement = databaseConnection.prepareCall(query);

            callableStatement.setInt(1, id);
            callableStatement.setString(2, desc);
            callableStatement.executeUpdate();

            Course course = ELearningPlatformService.findCourseById(id);
            course.setDescription(desc);
            auditCsvService.writeCsv("course " + id + " description updated");
        } catch (SQLException | NullPointerException throwables) {
            auditCsvService.writeCsv("Exception in CourseDao.java: updateCourseDescription: " + throwables);
        }
    }

    @Override
    public void run() {
        try {
            final String query = "SELECT id, teacherId, courseName, description FROM Course";
            Statement statement = databaseConnection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Course course = mapToCourse(resultSet);
                synchronized (AdminInterface.courses) {
                    AdminInterface.courses.add(course);
                }
            }
        } catch (SQLException | InterruptedException throwables) {
            auditCsvService.writeCsv("Exception in CourseDao.java: run: " + throwables);
        }
    }

    private Course mapToCourse(ResultSet resultSet) throws SQLException, InterruptedException {
        Teacher teacher = null;
        while (teacher == null) {
            try {
                teacher = (Teacher) ELearningPlatformService.findUserById(resultSet.getInt(2));
            } catch (NullPointerException e) {
                Thread.sleep(500);
            }
        }
        return new Course(resultSet.getInt(1), teacher, resultSet.getString(3), resultSet.getString(4));
    }
}
