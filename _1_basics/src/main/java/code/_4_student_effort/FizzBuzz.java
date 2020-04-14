package code._4_student_effort;

public class FizzBuzz {
    public static void main(String[] args) {
        String commaAndSpace = ", ";
        boolean divisibleBy3;
        boolean divisibleBy5;
        boolean divisibleBy7;
        boolean divisibleBy11;
        boolean divisibleWithSomething;

        for (int i = 1; i <= 100; i++) {
            divisibleBy3 = (i % 3 == 0);
            divisibleBy5 = (i % 5 == 0);
            divisibleBy7 = (i % 7 == 0);
            divisibleBy11 = (i % 11 == 0);
            divisibleWithSomething =
                    divisibleBy3 || divisibleBy5 || divisibleBy7 || divisibleBy11;

            if (divisibleBy3)
                System.out.print("Fizz");
            if (divisibleBy5)
                System.out.print("Buzz");
            if (divisibleBy7)
                System.out.print("Rizz");
            if (divisibleBy11)
                System.out.print("Jazz");
            if (!divisibleWithSomething)
                System.out.print(i);

            System.out.print(commaAndSpace);
        }
    }
}
