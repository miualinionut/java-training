package Business.UseCases.NoteUseCase;

import Business.Models.Nota;
import Business.Repositories.INotaRepository;
import Business.UseCases.IUseCase;
import Business.Views.IViewsNote.IViewAddNota;

import java.sql.SQLException;


public class AddNotaUseCase implements IUseCase{
    private String name = "2.Adauga";
    private String description = "-adauga o nota";
    private INotaRepository notaRepository;
    private IViewAddNota viewAddNota;

    public AddNotaUseCase(INotaRepository notaRepository, IViewAddNota viewAddNota) {
        this.notaRepository = notaRepository;
        this.viewAddNota = viewAddNota;
    }

    @Override
    public void execute() {
        Nota nota = viewAddNota.InsertNotaInfo();
        try {
            notaRepository.add(nota);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
