package clean.code.design_patterns.requirements.platform.dao;

import clean.code.design_patterns.requirements.platform.pojo.AnonymousCourseFeedback;
import clean.code.design_patterns.requirements.platform.pojo.Course;
import clean.code.design_patterns.requirements.platform.util.AdminInterface;
import clean.code.design_patterns.requirements.platform.util.Dao;
import clean.code.design_patterns.requirements.platform.util.ELearningPlatformService;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class AnonymousCourseFeedbackDao extends Dao {
    private static AnonymousCourseFeedbackDao anonymousCourseFeedbackDao;

    private AnonymousCourseFeedbackDao() {
        super();
    }

    @Override
    protected void createTable() {
        final String query = "CREATE TABLE IF NOT EXISTS AnonymousCourseFeedback (\n" +
                "id INT,\n" +
                "courseId INT,\n" +
                "feedback VARCHAR(1024) NOT NULL,\n" +
                "PRIMARY KEY (id,courseId),\n" +
                "FOREIGN KEY (courseId) REFERENCES Course (id) ON DELETE CASCADE)";
        try {
            Statement statement = databaseConnection.createStatement();
            statement.execute(query);
        } catch (SQLException throwables) {
            auditCsvService.writeCsv("Exception in AnonymousCourseFeedbackDao.java: createTable: " + throwables);
        }
    }

    static AnonymousCourseFeedbackDao getAnonymousCourseFeedbackDao() {
        if (anonymousCourseFeedbackDao == null)
            anonymousCourseFeedbackDao = new AnonymousCourseFeedbackDao();
        return anonymousCourseFeedbackDao;
    }

    public void writeAnonymousCourseFeedback(AnonymousCourseFeedback anonymousCourseFeedback) {
        try {
            final String query = "INSERT INTO AnonymousCourseFeedback(id, courseId, feedback) values(?,?,?)";

            PreparedStatement preparedStatement1 = databaseConnection.prepareStatement(query, Statement.NO_GENERATED_KEYS);
            preparedStatement1.setInt(1, anonymousCourseFeedback.getId());
            preparedStatement1.setInt(2, anonymousCourseFeedback.getCourse().getId());
            preparedStatement1.setString(3, anonymousCourseFeedback.getFeedback());
            preparedStatement1.execute();
        } catch (SQLException throwables) {
            auditCsvService.writeCsv("Exception in AnonymousCourseFeedbackDao.java: writeAnonymousCourseFeedback: " + throwables);
        }
    }

    public void deleteAnonymousCourseFeedback(AnonymousCourseFeedback anonymousCourseFeedback) {
        try {
            final String query = "DELETE FROM AnonymousCourseFeedback WHERE id=? and courseId=?";
            PreparedStatement preparedStatement1 = databaseConnection.prepareStatement(query, Statement.NO_GENERATED_KEYS);
            int id = anonymousCourseFeedback.getId();
            int courseId = anonymousCourseFeedback.getCourse().getId();
            preparedStatement1.setInt(1, id);
            preparedStatement1.setInt(2, courseId);
            preparedStatement1.execute();
            AdminInterface.feedbacks.remove(anonymousCourseFeedback);
            auditCsvService.writeCsv("feedback " + id + "(course " + courseId + ") deleted from database");
        } catch (SQLException throwables) {
            auditCsvService.writeCsv("Exception in AnonymousCourseFeedbackDao.java: deleteAnonymousCourseFeedback: " + throwables);
        }
    }

    @Override
    public void run() {
        try {
            final String query = "SELECT id, courseId, feedback FROM AnonymousCourseFeedback";
            Statement statement = databaseConnection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                AnonymousCourseFeedback anonymousCourseFeedback = mapToAnonymousCourseFeedback(resultSet);
                synchronized (AdminInterface.feedbacks) {
                    AdminInterface.feedbacks.add(anonymousCourseFeedback);
                }
            }
        } catch (SQLException | InterruptedException throwables) {
            auditCsvService.writeCsv("Exception in AnonymousCourseFeedbackDao.java: run: " + throwables);
        }
    }

    private AnonymousCourseFeedback mapToAnonymousCourseFeedback(ResultSet resultSet) throws SQLException, InterruptedException {
        Course course = null;
        while (course == null) {
            try {
                course = ELearningPlatformService.findCourseById(resultSet.getInt(2));
            } catch (NullPointerException e) {
                Thread.sleep(500);
            }
        }
        return new AnonymousCourseFeedback.Builder(course)
                .setId(resultSet.getInt(1))
                .setFeedback(resultSet.getString(3))
                .build();
    }
}
