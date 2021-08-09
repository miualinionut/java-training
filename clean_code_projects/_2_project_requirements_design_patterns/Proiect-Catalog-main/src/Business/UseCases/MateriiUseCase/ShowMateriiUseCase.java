package Business.UseCases.MateriiUseCase;

import Business.Models.Materie;
import Business.Repositories.IMaterieRepository;

import Business.UseCases.IUseCase;
import Business.Views.IViewsMaterii.IViewShowMaterii;


import java.sql.SQLException;
import java.util.List;

public class ShowMateriiUseCase implements IUseCase {
    private String name = "1.Afiseaza";
    private String description = "-afiseaza toate materiile";
    private IViewShowMaterii viewShowMaterii;
    private IMaterieRepository materieRepository;
    public ShowMateriiUseCase( IMaterieRepository materieRepository,IViewShowMaterii viewShowMaterii) {
        this.materieRepository = materieRepository;
        this.viewShowMaterii = viewShowMaterii;
    }

    @Override
    public void execute() {
        try {
            List<Materie> materii = materieRepository.getAll();
            viewShowMaterii.showMaterii(materii);
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
