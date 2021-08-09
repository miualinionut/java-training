package Business.UseCases.NoteUseCase;

import Business.Models.Nota;
import Business.Repositories.INotaRepository;
import Business.UseCases.IUseCase;
import Business.Views.IViewsNote.IViewRemoveNota;


import java.sql.SQLException;
import java.util.List;

public class RemoveNotaUseCase implements IUseCase {
    private String name = "3.Sterge";
    private String description = "-Sterge o nota";
    private INotaRepository notaRepository;
    private IViewRemoveNota viewRemoveNota;

    public RemoveNotaUseCase(INotaRepository notaRepository, IViewRemoveNota viewRemoveNota) {
        this.notaRepository = notaRepository;
        this.viewRemoveNota = viewRemoveNota;
    }

    @Override
    public void execute() {
            List<Nota> note;
            try {
                note = notaRepository.getAll();
                int removedGradeId = viewRemoveNota.GetGradeToBeRemoved();
                for (Nota nota : note) {
                    if (removedGradeId == nota.getIdNota()) {
                        notaRepository.remove(nota.getIdNota());
                        break;
                    }
                }
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
