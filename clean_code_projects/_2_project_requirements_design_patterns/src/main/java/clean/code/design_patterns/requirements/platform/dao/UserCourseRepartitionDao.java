package clean.code.design_patterns.requirements.platform.dao;

import clean.code.design_patterns.requirements.platform.pojo.Course;
import clean.code.design_patterns.requirements.platform.pojo.User;
import clean.code.design_patterns.requirements.platform.pojo.UserCourseRepartition;
import clean.code.design_patterns.requirements.platform.util.AdminInterface;
import clean.code.design_patterns.requirements.platform.util.Dao;
import clean.code.design_patterns.requirements.platform.util.ELearningPlatformService;

import java.sql.*;

public final class UserCourseRepartitionDao extends Dao {
    private static UserCourseRepartitionDao userCourseRepartitionDao;

    private UserCourseRepartitionDao() {
        super();
    }

    @Override
    protected void createTable() {
        final String query = "CREATE TABLE IF NOT EXISTS UserCourseRepartition (\n" +
                "userId Int,\n" +
                "courseId INT,\n" +
                "startDate Date Not NULL,\n" +
                "PRIMARY KEY (courseId, userId, startDate),\n" +
                "FOREIGN KEY (courseId) REFERENCES Course (id) ON DELETE CASCADE,\n" +
                "FOREIGN KEY (userId) REFERENCES User (id) ON DELETE CASCADE)";

        try {
            Statement statement = databaseConnection.createStatement();
            statement.execute(query);
        } catch (SQLException throwables) {
            auditCsvService.writeCsv("Exception in UserCourseRepartitionDao.java: createTable: " + throwables);
        }
    }

    static UserCourseRepartitionDao getUserCourseRepartitionDao() {
        if (userCourseRepartitionDao == null)
            userCourseRepartitionDao = new UserCourseRepartitionDao();
        return userCourseRepartitionDao;
    }

    public void writeUserCourseRepartition(UserCourseRepartition userCourseRepartition) {
        try {
            final String query = "INSERT INTO UserCourseRepartition(userId, courseId, startDate) values(?,?,?)";

            PreparedStatement preparedStatement1 = databaseConnection.prepareStatement(query, Statement.NO_GENERATED_KEYS);
            preparedStatement1.setInt(1, userCourseRepartition.getUser().getId());
            preparedStatement1.setInt(2, userCourseRepartition.getCourse().getId());
            preparedStatement1.setDate(3, userCourseRepartition.getStartDate());
            preparedStatement1.execute();
        } catch (SQLException throwables) {
            auditCsvService.writeCsv("Exception in UserCourseRepartitionDao.java: writeUserCourseRepartition: " + throwables);
        }
    }

    public void deleteUserCourseRepartition(UserCourseRepartition userCourseRepartition) {
        try {
            final String query = "DELETE FROM UserCourseRepartition where userId=? and courseId=? and startDate=?";
            PreparedStatement preparedStatement1 = databaseConnection.prepareStatement(query, Statement.NO_GENERATED_KEYS);
            int userId = userCourseRepartition.getUser().getId();
            int courseId = userCourseRepartition.getCourse().getId();
            Date date = userCourseRepartition.getStartDate();
            preparedStatement1.setInt(1, userId);
            preparedStatement1.setInt(2, courseId);
            preparedStatement1.setDate(3, userCourseRepartition.getStartDate());
            preparedStatement1.execute();
            AdminInterface.userCourseRepartitions.remove(userCourseRepartition);
            auditCsvService.writeCsv("reparition (c " + courseId + "; u " + userId + "; d " + date + ") deleted from database");
        } catch (SQLException throwables) {
            auditCsvService.writeCsv("Exception in UserCourseRepartitionDao.java: deleteUserCourseRepartition: " + throwables);
        }
    }

    @Override
    public void run() {
        try {
            final String query = "SELECT userId, courseId, startDate FROM UserCourseRepartition";
            Statement statement = databaseConnection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                UserCourseRepartition userCourseRepartition = mapToUserCourseRepartition(resultSet);
                synchronized (AdminInterface.userCourseRepartitions) {
                    AdminInterface.userCourseRepartitions.add(userCourseRepartition);
                }
            }
        } catch (SQLException | InterruptedException throwables) {
            auditCsvService.writeCsv("Exception in UserCourseRepartitionDao.java: run: " + throwables);
        }
    }

    private UserCourseRepartition mapToUserCourseRepartition(ResultSet resultSet) throws SQLException, InterruptedException {
        User user = null;
        while (user == null) {
            try {
                user = ELearningPlatformService.findUserById(resultSet.getInt(1));
            } catch (NullPointerException e) {
                Thread.sleep(500);
            }
        }
        Course course = null;
        while (course == null) {
            try {
                course = ELearningPlatformService.findCourseById(resultSet.getInt(2));
            } catch (NullPointerException e) {
                Thread.sleep(500);
            }
        }
        return new UserCourseRepartition(resultSet.getDate(3), course, user);
    }
}
