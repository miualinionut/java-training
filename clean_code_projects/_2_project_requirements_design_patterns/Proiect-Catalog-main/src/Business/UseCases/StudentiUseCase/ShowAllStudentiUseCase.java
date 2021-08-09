package Business.UseCases.StudentiUseCase;

import Business.Models.Student;
import Business.Repositories.IStudentRepository;
import Business.UseCases.IUseCase;
import Business.Views.IViewsStudenti.IViewShowAllStudenti;


import java.sql.SQLException;
import java.util.List;

public class ShowAllStudentiUseCase implements IUseCase {
    private String name = "1.Afiseaza";
    private String description = "-afiseaza toti studentii";
    private IViewShowAllStudenti viewShowAllStudenti;
    private IStudentRepository studentRepository;
    public ShowAllStudentiUseCase(IStudentRepository studentRepository,
                                  IViewShowAllStudenti viewShowAllStudenti) {
        this.studentRepository = studentRepository;
        this.viewShowAllStudenti = viewShowAllStudenti;
    }


    @Override
    public void execute() {
        try {
            List<Student> studenti = studentRepository.getAll();
            viewShowAllStudenti.showAllStudenti(studenti);
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
