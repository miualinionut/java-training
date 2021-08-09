package Business.UseCases.NoteUseCase;

import Business.Models.Nota;
import Business.Repositories.INotaRepository;
import Business.UseCases.IUseCase;
import Business.Views.IViewsNote.IViewShowAllNote;
import java.sql.SQLException;
import java.util.List;

public class ShowAllNoteUseCase implements IUseCase {
    private String name = "1.Afiseaza";
    private String description = "-afiseaza toate notele";
    private IViewShowAllNote viewShowAllNote;
    private INotaRepository notaRepository;
    public ShowAllNoteUseCase( INotaRepository notaRepository,IViewShowAllNote viewShowAllNote) {
        this.notaRepository = notaRepository;
        this.viewShowAllNote = viewShowAllNote;
    }


    @Override
    public void execute() {
        try {
            List<Nota> note = notaRepository.getAll();
            viewShowAllNote.showAllNote(note);
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
