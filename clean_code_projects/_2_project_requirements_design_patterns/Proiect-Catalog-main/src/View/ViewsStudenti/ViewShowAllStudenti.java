package View.ViewsStudenti;

import Business.Models.Student;
import Business.Views.IViewsStudenti.IViewShowAllStudenti;

import java.util.List;

public class ViewShowAllStudenti implements IViewShowAllStudenti {

    @Override
    public void showAllStudenti(List<Student> studenti) {
        for (Student student : studenti) {
            System.out.println(student);
        }
    }
}
