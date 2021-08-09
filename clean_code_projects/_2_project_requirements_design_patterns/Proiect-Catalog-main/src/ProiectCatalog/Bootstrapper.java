package ProiectCatalog;

import Business.UseCases.MateriiUseCase.AddMaterieUseCase;
import Business.UseCases.MateriiUseCase.MaterieUseCase;
import Business.UseCases.MateriiUseCase.RemoveMaterieUseCase;
import Business.UseCases.MateriiUseCase.ShowMateriiUseCase;
import Business.UseCases.NoteUseCase.AddNotaUseCase;
import Business.UseCases.NoteUseCase.NoteUseCase;
import Business.UseCases.NoteUseCase.RemoveNotaUseCase;
import Business.UseCases.NoteUseCase.ShowAllNoteUseCase;
import Business.UseCases.StudentiUseCase.AddStudentUseCase;
import Business.UseCases.StudentiUseCase.RemoveStudentUseCase;
import Business.UseCases.StudentiUseCase.ShowAllStudentiUseCase;
import Database.DBConnectionUtil;
import Database.MaterieRepository;
import Database.NotaRepository;
import Database.StudentRepository;
import Business.UseCases.IUseCase;
import Business.UseCases.StudentiUseCase.StudentiUseCase;
import View.ViewsMaterii.ViewAddMaterie;
import View.ViewsMaterii.ViewMaterii;
import View.ViewsMaterii.ViewRemoveMaterie;
import View.ViewsMaterii.ViewShowMaterii;
import View.ViewsNote.ViewAddNota;
import View.ViewsNote.ViewNote;
import View.ViewsNote.ViewRemoveNota;
import View.ViewsNote.ViewShowAllNote;
import View.ViewsStudenti.ViewAddStudent;
import View.ViewsStudenti.ViewRemoveStudent;
import View.ViewsStudenti.ViewShowAllStudenti;
import View.ViewsStudenti.ViewStudenti;


import java.util.Arrays;
import java.util.List;

public class Bootstrapper {
    public CatalogApplication buildApplication() {

        DBConnectionUtil dbConnectionUtil = new DBConnectionUtil();
        StudentRepository studentRepository = new StudentRepository(dbConnectionUtil);
        MaterieRepository materieRepository = new MaterieRepository(dbConnectionUtil);
        NotaRepository notaRepository = new NotaRepository(dbConnectionUtil);

        ViewShowAllStudenti viewShowAllStudenti = new ViewShowAllStudenti();
        ViewAddStudent viewAddStudent = new ViewAddStudent();
        ViewRemoveStudent viewRemoveStudent = new ViewRemoveStudent();

        ViewShowAllNote viewShowAllNote = new ViewShowAllNote();
        ViewAddNota viewAddNota = new ViewAddNota();
        ViewRemoveNota viewRemoveNota = new ViewRemoveNota();

        ViewShowMaterii viewShowMaterii = new ViewShowMaterii();
        ViewAddMaterie viewAddMaterie = new ViewAddMaterie();
        ViewRemoveMaterie viewRemoveMaterie = new ViewRemoveMaterie();

        List<IUseCase> studentiUseCases = Arrays.asList(new ShowAllStudentiUseCase(studentRepository,viewShowAllStudenti),
                new AddStudentUseCase(studentRepository, viewAddStudent),
                new RemoveStudentUseCase(studentRepository, viewRemoveStudent));

        List<IUseCase> noteUseCases = Arrays.asList(new ShowAllNoteUseCase(notaRepository,viewShowAllNote),
                new AddNotaUseCase(notaRepository,viewAddNota),
                new RemoveNotaUseCase(notaRepository,viewRemoveNota));

        List<IUseCase> materiiUseCases = Arrays.asList(new ShowMateriiUseCase(materieRepository,viewShowMaterii),
                new AddMaterieUseCase(materieRepository,viewAddMaterie),
                new RemoveMaterieUseCase(materieRepository,viewRemoveMaterie));

        ViewStudenti viewStudenti = new ViewStudenti(studentiUseCases);
        ViewNote viewNote = new ViewNote(noteUseCases);
        ViewMaterii viewMaterii = new ViewMaterii(materiiUseCases);

        List<IUseCase> useCases = Arrays.asList(new StudentiUseCase(viewStudenti) ,
                new MaterieUseCase(viewMaterii),
                new NoteUseCase(viewNote));

        return new CatalogApplication(useCases);
    }


}
