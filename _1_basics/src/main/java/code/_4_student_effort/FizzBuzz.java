package code._4_student_effort;

public class FizzBuzz {

    public void printNumbers(int upperBoundary) {
        for (int number = 1; number <= upperBoundary; number++) {
            if (number % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (number % 3 == 0) {
                System.out.println("Fizz");
            } else if (number % 5 == 0) {
                System.out.println("Buzz");
            } else if (number % 7 == 0) {
                System.out.println("Rizz");
            } else if (number % 11 == 0) {
                System.out.println("Jazz");
            } else {
                System.out.println(number);
            }
        }
    }

}
