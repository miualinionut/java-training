package code._4_student_effort;

import java.util.Scanner;

public class CodeChallenge2 {
    private static String compute(Integer i) {
        String result = "";

        if (i % 3 == 0)
            result += "Foo";

        if (i % 5 == 0)
            result += "Bar";

        if (i % 7 == 0)
            result += "Qix";

        char[] digits = String.valueOf(i).toCharArray();
        for (char digit : digits) {

            if (digit == '3') result += "Foo";
            else if (digit == '5') result += "Bar";
            else if (digit == '7') result += "Qix";
        }

        if (result.isEmpty())
            result = String.valueOf(i);

        return result;
    }

    private static String compute2(int i) {
        String result = "";
        Boolean isDivisible = false;

        if (i % 3 == 0) {
            result += "Foo";
            isDivisible = true;
        }

        if (i % 5 == 0) {
            result += "Bar";
            isDivisible = true;
        }

        if (i % 7 == 0) {
            result += "Qix";
            isDivisible = true;
        }

        char[] digits = String.valueOf(i).toCharArray();
        for (char digit : digits) {
            if (digit == '3') result += "Foo";
            else if (digit == '5') result += "Bar";
            else if (digit == '7') result += "Qix";
            else if (digit == '0') result += "*";
            else if (!isDivisible) result += digit;
        }

        if (result.isEmpty()) {
            result = String.valueOf(i);
        }

        return result;
    }

    public void requirement1(Scanner scanner){
        System.out.println("Requirement 1, please insert a number:");
        int i = scanner.nextInt();
        System.out.println(compute(i));
    }

    public void requirement2(Scanner scanner) {
        System.out.println("Requirement 2, please insert a number:");
            int i = scanner.nextInt();
            System.out.println(compute2(i));
    }
}
