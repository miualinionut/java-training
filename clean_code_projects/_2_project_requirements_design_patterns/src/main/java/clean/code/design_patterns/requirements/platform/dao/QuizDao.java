package clean.code.design_patterns.requirements.platform.dao;

import org.jetbrains.annotations.NotNull;
import clean.code.design_patterns.requirements.platform.pojo.Course;
import clean.code.design_patterns.requirements.platform.pojo.Quiz;
import clean.code.design_patterns.requirements.platform.util.AdminInterface;
import clean.code.design_patterns.requirements.platform.util.Dao;
import clean.code.design_patterns.requirements.platform.util.ELearningPlatformService;

import java.sql.*;

public final class QuizDao extends Dao {
    private static QuizDao quizDao;

    private QuizDao() {
        super();
        createUpdateProcedure();
    }

    @Override
    protected void createTable() {
        final String query = "CREATE TABLE IF NOT EXISTS Quiz (\n" +
                "id INT PRIMARY KEY ,\n" +
                "courseId Int,\n" +
                "quiz VARCHAR(1024) Not NULL,\n" +
                "FOREIGN KEY (courseId) REFERENCES Course (id) ON DELETE CASCADE)";

        try {
            Statement statement = databaseConnection.createStatement();
            statement.execute(query);
        } catch (SQLException throwables) {
            auditCsvService.writeCsv("Exception in QuizDao.java: createTable: " + throwables);
        }
    }

    private void createUpdateProcedure() {
        final String query = "CREATE OR REPLACE PROCEDURE updateQuizContent (IN id1 INT, IN quiz1 VARCHAR(1024) ) " +
                "BEGIN " +
                "update Quiz " +
                "set quiz=quiz1 " +
                "where id=id1; " +
                "end";
        try {
            Statement statement = databaseConnection.createStatement();
            statement.execute(query);
        } catch (SQLException throwables) {
            auditCsvService.writeCsv("Exception in QuizDao.java: createUpdateProcedure: " + throwables);
        }
    }

    static QuizDao getQuizDao() {
        if (quizDao == null)
            quizDao = new QuizDao();
        return quizDao;
    }

    public void writeQuiz(Quiz quiz) {
        try {
            final String query = "INSERT INTO Quiz(id, courseId, quiz) values(?,?,?)";

            PreparedStatement preparedStatement1 = databaseConnection.prepareStatement(query, Statement.NO_GENERATED_KEYS);
            preparedStatement1.setInt(1, quiz.getId());
            preparedStatement1.setInt(2, quiz.getCourse().getId());
            preparedStatement1.setString(3, quiz.getQuiz());
            preparedStatement1.execute();
        } catch (SQLException throwables) {
            auditCsvService.writeCsv("Exception in QuizDao.java: writeQuiz: " + throwables);
        }
    }

    public void deleteQuiz(int quizId) {
        try {
            final String query = "DELETE FROM Quiz WHERE id=?";
            PreparedStatement preparedStatement1 = databaseConnection.prepareStatement(query, Statement.NO_GENERATED_KEYS);
            preparedStatement1.setInt(1, quizId);
            preparedStatement1.execute();
            AdminInterface.quizzes.remove(ELearningPlatformService.findQuizById(quizId));
            auditCsvService.writeCsv("quiz " + quizId + " deleted from database");
        } catch (SQLException | NullPointerException throwables) {
            auditCsvService.writeCsv("Exception in QuizDao.java: deleteQuiz: " + throwables);
        }
    }

    @Override
    public void run() {
        try {
            final String query = "SELECT id, courseId, quiz FROM Quiz";
            Statement statement = databaseConnection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                Quiz quiz = mapToQuiz(resultSet);
                synchronized (AdminInterface.quizzes) {
                    AdminInterface.quizzes.add(quiz);
                }
            }
        } catch (SQLException | InterruptedException throwables) {
            auditCsvService.writeCsv("Exception in QuizDao.java: run: " + throwables);
        }
    }

    private Quiz mapToQuiz(ResultSet resultSet) throws SQLException, InterruptedException {
        Course course = null;
        while (course == null) {
            try {
                course = ELearningPlatformService.findCourseById(resultSet.getInt(2));
            } catch (NullPointerException e) {
                Thread.sleep(500);
            }
        }
        return new Quiz.Builder(course)
                .setId(resultSet.getInt(1))
                .setQuizContent(resultSet.getString(3))
                .build();
    }

    public void updateQuizContent(int quizId, @NotNull String content) {
        try {
            final String query = "{call updateQuizContent(?,?)}";
            CallableStatement callableStatement = databaseConnection.prepareCall(query);

            callableStatement.setInt(1, quizId);
            callableStatement.setString(2, content);
            callableStatement.executeUpdate();

            Quiz quiz = ELearningPlatformService.findQuizById(quizId);
            quiz.setQuiz(content);
            auditCsvService.writeCsv("quiz " + quizId + " updated");
        } catch (SQLException throwables) {
            auditCsvService.writeCsv("Exception in QuizDao.java: updateQuizContent: " + throwables);
        }
    }
}
