package main.java.code._4_student_effort;

public class Challenge {
    public void FizzBuzz() {
        // FizzBuzz

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 7 == 0) {
                System.out.println("Rizz");
            } else if (i % 11 == 0) {
                System.out.println("Jazz");
            } else
                System.out.println(i);
        }
    }

    public String compute(int number) {

        String computedString = "";
        if (number % 3 == 0)
            computedString += "Foo";
        if (number % 5 == 0)
            computedString += "Bar";
        if (number % 7 == 0)
            computedString += "Qix";

        char[] cifre = String.valueOf(number).toCharArray();
        for (char cifra : cifre) {
            if (cifra == '3')
                computedString += "Foo";
            else if (cifra == '5')
                computedString += "Bar";
            else if (cifra == '7')
                computedString += "Qix";
            else if (cifra == '0')
                computedString += "*";
        }

        return s;
        return computedString;
    }
}