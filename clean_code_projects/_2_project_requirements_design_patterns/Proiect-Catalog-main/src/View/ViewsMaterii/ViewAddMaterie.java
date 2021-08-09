package View.ViewsMaterii;

import Business.Models.Materie;
import Business.Views.IViewsMaterii.IViewAddMaterie;

import java.util.Scanner;

public class ViewAddMaterie implements IViewAddMaterie {
    @Override
    public Materie InsertMaterieInfo() {
        System.out.println("Add a class by writing their info in this order:\n Nume Materie\n Nume Profesor");
        Scanner scanner = new Scanner(System.in);
        Materie materie = new Materie(0,
                scanner.nextLine(),
                scanner.nextLine());
        return materie;
    }
}
