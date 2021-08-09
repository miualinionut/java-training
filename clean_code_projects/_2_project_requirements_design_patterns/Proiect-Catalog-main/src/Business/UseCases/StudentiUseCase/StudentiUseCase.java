package Business.UseCases.StudentiUseCase;

import Business.UseCases.IUseCase;
import View.ViewsStudenti.ViewStudenti;

public class StudentiUseCase implements IUseCase {

    private final String name = "Studenti";
    private final String description = "- operatii pe tabela de studenti";

    private ViewStudenti viewStudenti;

    public StudentiUseCase(ViewStudenti viewStudenti) {
        this.viewStudenti = viewStudenti;
    }

    public void execute() {
     viewStudenti.displayUseCases();
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
