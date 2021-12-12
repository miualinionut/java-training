package clean.code.design_patterns.requirements.platform.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class Dao extends Thread {
    protected static Connection databaseConnection;
    protected final AuditCsvService auditCsvService;

    protected Dao() {
        auditCsvService = AuditCsvService.getInstance();
        try {
            if (databaseConnection == null || databaseConnection.isClosed()) {
                Class.forName("com.mysql.cj.jdbc.Driver");
                createDatabase();
                databaseConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/elearning", "root", "root");
            }
        } catch (SQLException | ClassNotFoundException throwables) {
            auditCsvService.writeCsv("Exception in Dao.java: constructor: " + throwables);
        }
        createTable();
    }

    private void createDatabase() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "root");
            final String query = "CREATE DATABASE IF NOT EXISTS elearning";
            Statement statement = connection.createStatement();
            statement.executeUpdate(query);
        } catch (SQLException throwables) {
            auditCsvService.writeCsv("Exception in Dao.java: createDatabase(create): " + throwables);
        } finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException throwables) {
                auditCsvService.writeCsv("Exception in Dao.java: createDatabase(close): " + throwables);
            }
        }
    }

    protected abstract void createTable();
}
