package Business.UseCases.MateriiUseCase;

import Business.Models.Materie;
import Business.Repositories.IMaterieRepository;
import Business.Repositories.INotaRepository;
import Business.UseCases.IUseCase;
import Business.Views.IViewsMaterii.IViewAddMaterie;
import Business.Views.IViewsNote.IViewAddNota;

import java.sql.SQLException;

public class AddMaterieUseCase implements IUseCase {
    private String name = "2.Adauga";
    private String description = "-adauga o materie";
    private IMaterieRepository materieRepository;
    private IViewAddMaterie viewAddMaterie;

    public AddMaterieUseCase(IMaterieRepository materieRepository, IViewAddMaterie viewAddMaterie) {
        this.materieRepository = materieRepository;
        this.viewAddMaterie = viewAddMaterie;
    }

    @Override
    public void execute() {
        Materie materie = viewAddMaterie.InsertMaterieInfo();
        try {
            materieRepository.add(materie);
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
