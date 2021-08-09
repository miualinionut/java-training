package Business.UseCases.MateriiUseCase;

import Business.Models.Materie;
import Business.Repositories.IMaterieRepository;
import Business.Repositories.INotaRepository;
import Business.UseCases.IUseCase;
import Business.Views.IViewsMaterii.IViewRemoveMaterie;
import Business.Views.IViewsNote.IViewRemoveNota;

import java.sql.SQLException;
import java.util.List;

public class RemoveMaterieUseCase implements IUseCase {

    private String name = "3.Sterge";
    private String description = "-Sterge o materie";
    private IMaterieRepository materieRepository;
    private IViewRemoveMaterie viewRemoveMaterie;

    public RemoveMaterieUseCase(IMaterieRepository materieRepository, IViewRemoveMaterie viewRemoveMaterie) {
        this.materieRepository = materieRepository;
        this.viewRemoveMaterie = viewRemoveMaterie;
    }

    @Override
    public void execute() {
        List<Materie> materii;
        try {
            materii = materieRepository.getAll();
            String removeClass = viewRemoveMaterie.GetClassToBeRemoved();
            for (Materie materie : materii) {
                if (removeClass.equals(materie.getNumeMaterie())) {
                    materieRepository.remove(removeClass);
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
