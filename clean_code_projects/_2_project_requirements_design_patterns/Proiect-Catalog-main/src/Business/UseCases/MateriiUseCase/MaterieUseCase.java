package Business.UseCases.MateriiUseCase;

import Business.UseCases.IUseCase;
import View.ViewsMaterii.ViewMaterii;

public class MaterieUseCase implements IUseCase {
    private final String name = "Materii";
    private final String description = "- operatii pe tabela de materii";

    private ViewMaterii viewMaterii;

    public MaterieUseCase(ViewMaterii viewMaterii) {
        this.viewMaterii = viewMaterii;
    }

    @Override
    public void execute() {
        viewMaterii.displayUseCases();
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
