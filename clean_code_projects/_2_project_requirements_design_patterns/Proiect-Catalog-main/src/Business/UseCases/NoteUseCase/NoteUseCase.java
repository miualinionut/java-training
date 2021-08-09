package Business.UseCases.NoteUseCase;


import Business.UseCases.IUseCase;
import View.ViewsNote.ViewNote;

public class NoteUseCase implements IUseCase {

    private final String name = "Note";
    private final String description = "- operatii pe tabela de note";

    private ViewNote viewNote;

    public NoteUseCase(ViewNote viewNote) {
        this.viewNote = viewNote;
    }

    public void execute() {
        viewNote.displayUseCases();
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
