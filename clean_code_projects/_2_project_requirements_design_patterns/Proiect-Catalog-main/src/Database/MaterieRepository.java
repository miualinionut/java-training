package Database;

import Business.Models.Materie;
import Business.Repositories.IMaterieRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class MaterieRepository implements IMaterieRepository {
    private final DBConnectionUtil dbConnectionUtil;

    public MaterieRepository(DBConnectionUtil dbConnectionUtil) {
        this.dbConnectionUtil = dbConnectionUtil;
    }

    @Override
    public Materie getById(int id) {
        Connection connection = dbConnectionUtil.getInstance();
        try {
            String query = "SELECT * FROM materie WHERE id = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setInt(1, id);

            /* Se executa query-ul*/
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return new Materie(id,
                        resultSet.getString("numeMaterie"),
                        resultSet.getString("numeProfesor"));
            }
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            dbConnectionUtil.closeDBConnection(connection);
        }
        return null;
    }

    @Override
    public List<Materie> getAll() {
        Connection connection = dbConnectionUtil.getInstance();
        try {
            String query = "SELECT * FROM materie";
            PreparedStatement statement = connection.prepareStatement(query);

            ResultSet resultSet = statement.executeQuery();
            List<Materie> list = new ArrayList<>();
            while (resultSet.next()) {
                Materie nextMaterie = new Materie(resultSet.getInt("idmaterie"),
                        resultSet.getString("numeMaterie"),
                        resultSet.getString("numeProfesor"));
                list.add(nextMaterie);
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
    public void add(Materie materie) {
        Connection connection = dbConnectionUtil.getInstance();
        try {
            String query = "INSERT INTO materie (numeMaterie, numeProfesor) VALUES(?, ?)";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(1, materie.getNumeMaterie());
            statement.setString(2, materie.getNumeProfesor());

            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            dbConnectionUtil.closeDBConnection(connection);
        }
    }

    @Override
    public void remove(String numeMaterie) {
        Connection connection = dbConnectionUtil.getInstance();
        try {
            String query = "DELETE FROM materie where numeMaterie = ?";
            PreparedStatement statement = connection.prepareStatement(query);
            statement.setString(1, numeMaterie);
            statement.executeUpdate();
        }catch (SQLException e){
            e.printStackTrace();
        }finally {
            dbConnectionUtil.closeDBConnection(connection);
        }
    }
}
