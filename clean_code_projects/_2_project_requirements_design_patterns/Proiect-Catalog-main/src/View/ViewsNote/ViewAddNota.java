package View.ViewsNote;

import Business.Models.Nota;
import Business.Models.Student;
import Business.Views.IViewsNote.IViewAddNota;

import java.util.Scanner;

public class ViewAddNota implements IViewAddNota {
    @Override
    public Nota InsertNotaInfo() {
        System.out.println("Add a grade by writing it's info in this order:\n Student's name\n Name of the class\n Grade");
        Scanner scanner = new Scanner(System.in);
        Nota nota = new Nota(0,
                scanner.nextLine(),
                scanner.nextLine(),
                Integer.parseInt(scanner.nextLine()));
        return nota;
    }
}
