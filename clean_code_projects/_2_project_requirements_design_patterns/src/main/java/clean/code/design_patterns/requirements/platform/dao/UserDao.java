package clean.code.design_patterns.requirements.platform.dao;

import org.jetbrains.annotations.NotNull;
import clean.code.design_patterns.requirements.platform.pojo.User;
import clean.code.design_patterns.requirements.platform.util.AdminInterface;
import clean.code.design_patterns.requirements.platform.util.Dao;
import clean.code.design_patterns.requirements.platform.util.ELearningPlatformService;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class UserDao extends Dao {
    UserDao() {
        super();
        createUpdateProcedure();
    }

    @Override
    protected void createTable() {
        final String query = "CREATE TABLE IF NOT EXISTS User (\n" +
                "id INT PRIMARY KEY,\n" +
                "userName VARCHAR(64) NOT NULL,\n" +
                "birthDate DATE NOT NULL,\n" +
                "address VARCHAR(128) NOT NULL,\n" +
                "phoneNumber VARCHAR(10) NOT NULL)";

        try {
            Statement statement = databaseConnection.createStatement();
            statement.execute(query);
        } catch (SQLException throwables) {
            auditCsvService.writeCsv("Exception in UserDao.java: createTable: " + throwables);
        }
    }

    private void createUpdateProcedure() {
        final String query = "CREATE OR REPLACE PROCEDURE updateUserPhoneAddress (IN id1 INT, IN address1 VARCHAR(128), IN phoneNumber1 VARCHAR(10) ) " +
                "BEGIN " +
                "update User " +
                "set address=address1, phoneNumber=phoneNumber1 " +
                "where id=id1; " +
                "end";
        try {
            Statement statement = databaseConnection.createStatement();
            statement.execute(query);
        } catch (SQLException throwables) {
            auditCsvService.writeCsv("Exception in UserDao.java: createUpdateProcedure: " + throwables);
        }
    }

    void writeUser(User user) {
        final String query = "INSERT INTO User(id,userName,birthDate,address,phoneNumber) values (?,?,?,?,?)";

        try {
            PreparedStatement preparedStatement = databaseConnection.prepareStatement(query, Statement.NO_GENERATED_KEYS);
            preparedStatement.setInt(1, user.getId());
            preparedStatement.setString(2, user.getUserName());
            preparedStatement.setDate(3, user.getBirthDate());
            preparedStatement.setString(4, user.getAddress());
            preparedStatement.setString(5, user.getPhoneNumber());
            preparedStatement.execute();
        } catch (SQLException throwables) {
            auditCsvService.writeCsv("Exception in UserDao.java: writeUser: " + throwables);
        }
    }

    void deleteUser(int userId) {
        try {
            final String query = "DELETE FROM User WHERE ID = ?";
            PreparedStatement preparedStatement = databaseConnection.prepareStatement(query, Statement.NO_GENERATED_KEYS);
            preparedStatement.setInt(1, userId);
            preparedStatement.execute();

            AdminInterface.users.remove(ELearningPlatformService.findUserById(userId));
        } catch (SQLException | NullPointerException throwables) {
            auditCsvService.writeCsv("Exception in UserDao.java: deleteUser: " + throwables);
        }
    }

    public void updateUserPhoneAddress(int userId, @NotNull String address, @NotNull String phoneNumber) throws IllegalArgumentException {
        try {
            User user = ELearningPlatformService.findUserById(userId);
            if (address.equals("*"))
                address = user.getAddress();
            if (phoneNumber.equals("*"))
                phoneNumber = user.getPhoneNumber();
            else if (!phoneNumber.matches("[0-9]{10}"))
                throw new IllegalArgumentException("incorrect phone number");

            final String query = "{call updateUserPhoneAddress(?,?,?)}";
            CallableStatement callableStatement = databaseConnection.prepareCall(query);

            callableStatement.setInt(1, userId);
            callableStatement.setString(2, address);
            callableStatement.setString(3, phoneNumber);
            callableStatement.executeUpdate();

            user.setAddress(address);
            user.setPhoneNumber(phoneNumber);
            auditCsvService.writeCsv("user " + userId + " info updated");
        } catch (SQLException | NullPointerException throwables) {
            auditCsvService.writeCsv("Exception in UserDao.java: updateUserPhoneAddress: " + throwables);
        }
    }

}
