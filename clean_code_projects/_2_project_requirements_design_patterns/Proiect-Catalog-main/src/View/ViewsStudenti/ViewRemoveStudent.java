package View.ViewsStudenti;

import Business.Views.IViewsStudenti.IViewRemoveStudent;

import java.util.Scanner;

public class ViewRemoveStudent implements IViewRemoveStudent {
    @Override
    public String GetStudentToBeRemoved() {
        System.out.println("What student to remove by it's name: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
}
