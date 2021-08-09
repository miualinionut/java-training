package View.ViewsNote;

import Business.Views.IViewsNote.IViewRemoveNota;

import java.util.Scanner;

public class ViewRemoveNota implements IViewRemoveNota {
    @Override
    public int GetGradeToBeRemoved() {
        System.out.println("What grade to remove by ID: ");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        return input;
    }
}
