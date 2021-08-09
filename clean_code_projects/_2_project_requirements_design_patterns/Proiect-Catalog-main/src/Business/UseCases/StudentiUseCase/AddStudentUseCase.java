package Business.UseCases.StudentiUseCase;

import Business.Models.Student;
import Business.Repositories.IStudentRepository;
import Business.UseCases.IUseCase;
import Business.Views.IViewsStudenti.IViewAddStudent;

import java.sql.SQLException;

public class AddStudentUseCase implements IUseCase {
    private String name = "2.Adauga";
    private String description = "-adauga un student";
    private IStudentRepository studentRepository;
    private IViewAddStudent viewAddStudent;
    public AddStudentUseCase(IStudentRepository studentRepository, IViewAddStudent viewAddStudent){
        this.studentRepository = studentRepository;
        this.viewAddStudent = viewAddStudent;
    }

    @Override
    public void execute() {
            Student student = viewAddStudent.InsertStudentInfo();
            try {
                studentRepository.add(student);
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
