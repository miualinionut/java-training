package clean.code.design_patterns.requirements.Template;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Base base;
        int userResponse, ind = 0;
        System.out.println("Welcome!Press 1 for integers and 2 for complex numbers operations\n");

        do {
            userResponse = Integer.parseInt(scan.nextLine());
            switch (userResponse) {
                case 1:
                    base = new Integers();
                    base.calculate();
                    ind = 1;
                    break;
                case 2:
                    base = new ComplexNumbers();
                    base.calculate();
                    ind = 1;
                    break;
                default:
                    System.out.println("You didn't choose one of the possible options, try again.\n");
            }
        }while(ind != 1);

    }
}
