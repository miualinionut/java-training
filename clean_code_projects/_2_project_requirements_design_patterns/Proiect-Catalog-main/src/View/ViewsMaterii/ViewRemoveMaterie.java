package View.ViewsMaterii;

import Business.Views.IViewsMaterii.IViewRemoveMaterie;

import java.util.Scanner;

public class ViewRemoveMaterie implements IViewRemoveMaterie {
    @Override
    public String GetClassToBeRemoved() {
        System.out.println("Class to be removed: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        return input;
    }
}
