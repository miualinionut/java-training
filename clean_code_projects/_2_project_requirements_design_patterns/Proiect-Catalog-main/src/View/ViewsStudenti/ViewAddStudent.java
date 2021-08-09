package View.ViewsStudenti;

import Business.Models.Student;
import Business.Views.IViewsStudenti.IViewAddStudent;
import java.util.Scanner;

public class ViewAddStudent implements IViewAddStudent {
    @Override
    public Student InsertStudentInfo() {
        System.out.println("Add a student by writing their info in this order:\n name\n surname\n year of study");
        Scanner scanner = new Scanner(System.in);
        Student student = new Student(0, scanner.nextLine(), scanner.nextLine(), Integer.parseInt(scanner.nextLine()));
        return student;
    }
}
