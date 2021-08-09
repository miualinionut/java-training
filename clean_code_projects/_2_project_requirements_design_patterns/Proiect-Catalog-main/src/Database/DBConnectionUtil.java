package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionUtil {
    private final String DATABASE_URL = "jdbc:mysql://127.0.0.1:3306/schema1";
    private final String DATABASE_USER = "root";
    private final String DATABASE_PASSWORD = "root";

    public Connection getInstance() {
        try {
            Connection connection = null;

            connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
            //System.out.println("Connection established!");
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        } return null;
    }

    public void closeDBConnection(Connection connection) {
        try {
            if (connection != null) {
                connection.close();
                //System.out.println("Connection closed!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}