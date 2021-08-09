package Database;

import Business.Models.Student;
import Business.Repositories.IStudentRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private final DBConnectionUtil dbConnectionUtil;

    public StudentRepository(DBConnectionUtil dbConnectionUtil) {
        this.dbConnectionUtil = dbConnectionUtil;
    }

    @Override
    public Student getById(int id) {
        Connection connection = dbConnectionUtil.getInstance();
        try {
            String query = "SELECT * FROM student WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Student(id,
                        resultSet.getString("nume"),
                        resultSet.getString("prenume"),
                        resultSet.getInt("anDeStudiu"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            dbConnectionUtil.closeDBConnection(connection);
        }
        return null;
    }

    @Override
    public List<Student> getAll() {
        Connection connection = dbConnectionUtil.getInstance();
        try {
            String query = "SELECT * FROM student";
            PreparedStatement statement = connection.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();
            List<Student> list = new ArrayList<>();
            while (resultSet.next()) {
                list.add(new Student(resultSet.getInt("idStudent"),
                        resultSet.getString("nume"),
                        resultSet.getString("prenume"),
                        resultSet.getInt("anDeStudiu")));
            }
            return list;
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            dbConnectionUtil.closeDBConnection(connection);
        }
        return null;
    }

    @Override
    public void add(Student student) {
        Connection connection = dbConnectionUtil.getInstance();
        try {
            String query = "INSERT INTO student (nume, prenume, anDeStudiu) VALUES(?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, student.getNume());
            statement.setString(2, student.getPrenume());
            statement.setInt(3, student.getAnDeStudiu());

            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            dbConnectionUtil.closeDBConnection(connection);
        }
    }

    @Override
    public void remove(String name) {
        Connection connection = dbConnectionUtil.getInstance();
        try {
            String query = "DELETE FROM student where nume = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, name);
            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            dbConnectionUtil.closeDBConnection(connection);
        }
    }
}


