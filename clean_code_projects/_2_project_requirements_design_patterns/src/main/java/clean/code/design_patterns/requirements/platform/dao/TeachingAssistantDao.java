package clean.code.design_patterns.requirements.platform.dao;

import clean.code.design_patterns.requirements.platform.pojo.Teacher;
import clean.code.design_patterns.requirements.platform.pojo.TeachingAssistant;
import clean.code.design_patterns.requirements.platform.util.AdminInterface;
import clean.code.design_patterns.requirements.platform.util.ELearningPlatformService;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public final class TeachingAssistantDao extends UserDao {
    private static TeachingAssistantDao teachingAssistantDao;

    private TeachingAssistantDao() {
        super();
    }

    @Override
    protected void createTable() {
        super.createTable();
        final String query = "CREATE TABLE IF NOT EXISTS TeachingAssistant (\n" +
                "id INT PRIMARY KEY,\n" +
                "supervisorTeacherId INT NOT NULL,\n" +
                "FOREIGN KEY (supervisorTeacherId) REFERENCES Teacher (id),\n" +
                "FOREIGN KEY (id) REFERENCES User(id) ON DELETE CASCADE)";

        try {
            Statement statement = databaseConnection.createStatement();
            statement.execute(query);
        } catch (SQLException throwables) {
            auditCsvService.writeCsv("Exception in TeachingAssistantDao.java: createTable: " + throwables);
        }
    }

    static TeachingAssistantDao getTeachingAssistantDao() {
        if (teachingAssistantDao == null)
            teachingAssistantDao = new TeachingAssistantDao();
        return teachingAssistantDao;
    }

    public void writeTeachingAssistant(TeachingAssistant teachingAssistant) {
        try {
            writeUser(teachingAssistant);
            final String query = "INSERT INTO TeachingAssistant(id,supervisorTeacherId ) values(?,?)";

            PreparedStatement preparedStatement1 = databaseConnection.prepareStatement(query, Statement.NO_GENERATED_KEYS);
            preparedStatement1.setInt(1, teachingAssistant.getId());
            preparedStatement1.setInt(2, teachingAssistant.getSupervisorTeacher().getId());
            preparedStatement1.execute();
        } catch (SQLException throwables) {
            auditCsvService.writeCsv("Exception in TeachingAssistantDao.java: writeTeachingAssistant: " + throwables);
        }
    }

    public void deleteTeachingAssistant(int teachingAssistantId) {
        try {
            final String query = "DELETE FROM TeachingAssistant WHERE id=?";
            PreparedStatement preparedStatement1 = databaseConnection.prepareStatement(query, Statement.NO_GENERATED_KEYS);
            preparedStatement1.setInt(1, teachingAssistantId);
            preparedStatement1.execute();
            deleteUser(teachingAssistantId);
            auditCsvService.writeCsv("teaching assistant " + teachingAssistantId + " deleted from database");
        } catch (SQLException throwables) {
            auditCsvService.writeCsv("Exception in TeachingAssistantDao.java: deleteTeachingAssistant: " + throwables);
        }
    }

    @Override
    public void run() {
        try {
            final String query = "SELECT t.id, t.supervisorTeacherId, u.userName, u.birthDate, u.address, u.phoneNumber FROM User u, TeachingAssistant t where u.id=t.id";
            Statement statement = databaseConnection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);

            while (resultSet.next()) {
                TeachingAssistant teachingAssistant = mapToTeachingAssistant(resultSet);
                synchronized (AdminInterface.users) {
                    AdminInterface.users.add(teachingAssistant);
                }
            }
        } catch (SQLException | InterruptedException throwables) {
            auditCsvService.writeCsv("Exception in TeachingAssistantDao.java: run: " + throwables);
        }
    }

    private TeachingAssistant mapToTeachingAssistant(ResultSet resultSet) throws SQLException, InterruptedException {
        Teacher supervisorTeacher = null;
        while (supervisorTeacher == null) {
            try {
                supervisorTeacher = (Teacher) ELearningPlatformService.findUserById(resultSet.getInt(2));
            } catch (NullPointerException e) {
                Thread.sleep(500);
            }
        }
        return new TeachingAssistant(resultSet.getInt(1), resultSet.getString(3), resultSet.getDate(4), supervisorTeacher, resultSet.getString(5), resultSet.getString(6));
    }

}
