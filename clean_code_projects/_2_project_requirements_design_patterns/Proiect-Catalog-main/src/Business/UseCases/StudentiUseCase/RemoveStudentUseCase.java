package Business.UseCases.StudentiUseCase;

import Business.Models.Student;
import Business.Repositories.IStudentRepository;
import Business.UseCases.IUseCase;
import Business.Views.IViewsStudenti.IViewRemoveStudent;

import java.sql.SQLException;
import java.util.List;

public class RemoveStudentUseCase implements IUseCase {
    private String name = "3.Sterge";
    private String description = "-Sterge un student";
    private IStudentRepository studentRepository;
    private IViewRemoveStudent viewRemoveStudent;
    public RemoveStudentUseCase(IStudentRepository studentRepository, IViewRemoveStudent viewRemoveStudent){
        this.studentRepository = studentRepository;
        this.viewRemoveStudent = viewRemoveStudent;
    }

    @Override
    public void execute() {
        List<Student> studenti;
        try {
            studenti = studentRepository.getAll();
            String removedStudent = viewRemoveStudent.GetStudentToBeRemoved();
            for (Student student : studenti) {
                if (removedStudent.equals(student.getNume())) {
                    studentRepository.remove(removedStudent);
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
