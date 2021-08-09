package Database;

import Business.Models.Nota;
import Business.Repositories.INotaRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class NotaRepository implements INotaRepository {
    private final DBConnectionUtil dbConnectionUtil;

    public NotaRepository(DBConnectionUtil dbConnectionUtil) {
        this.dbConnectionUtil = dbConnectionUtil;
    }

    @Override
    public Nota getById(int id) {
        Connection connection = dbConnectionUtil.getInstance();
        try {
            String query = "SELECT * FROM note WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);

            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Nota(id,
                        resultSet.getString("numeStudent"),
                        resultSet.getString("numeMaterie"),
                        resultSet.getInt("nota"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            dbConnectionUtil.closeDBConnection(connection);
        }
        return null;
    }

    @Override
    public List<Nota> getAll() {
        Connection connection = dbConnectionUtil.getInstance();
        try {
            String query = "SELECT * FROM note";
            PreparedStatement statement = connection.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();
            List<Nota> list = new ArrayList<>();
            while (resultSet.next()) {
                list.add(new Nota(resultSet.getInt("idNota"),
                        resultSet.getString("numeStudent"),
                        resultSet.getString("numeMaterie"),
                        resultSet.getInt("nota")));
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
    public void add(Nota nota) {
        Connection connection = dbConnectionUtil.getInstance();
        try {
            String query = "INSERT INTO note (numeStudent, numeMaterie, nota) VALUES(?, ?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, nota.getNumeStudent());
            statement.setString(2, nota.getNumeMaterie());
            statement.setInt(3, nota.getNota());

            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            dbConnectionUtil.closeDBConnection(connection);
        }
    }

    @Override
    public void remove(int id) {
        Connection connection = dbConnectionUtil.getInstance();
        try {
            String query = "DELETE FROM note where idNota = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            dbConnectionUtil.closeDBConnection(connection);
        }
    }
}
