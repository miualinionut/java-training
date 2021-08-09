package Business.Repositories;

import Business.Models.Nota;

import java.sql.SQLException;
import java.util.List;

public interface INotaRepository {

    Nota getById(int id) throws SQLException;

    List<Nota> getAll() throws SQLException;

    void remove(int id) throws SQLException;

    void add(Nota nota) throws SQLException;
}
