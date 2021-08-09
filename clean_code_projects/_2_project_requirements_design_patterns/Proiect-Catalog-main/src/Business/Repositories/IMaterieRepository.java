package Business.Repositories;

import Business.Models.Materie;

import java.sql.SQLException;
import java.util.List;


public interface IMaterieRepository {

    List<Materie> getAll() throws SQLException;

    Materie getById(int id) throws SQLException;

    void remove(String name) throws SQLException;

    void add(Materie materie) throws SQLException;

}
