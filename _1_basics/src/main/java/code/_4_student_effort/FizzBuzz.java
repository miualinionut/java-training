package code._4_student_effort;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 7 == 0) {
                System.out.println("Rizz");
            } else if (i % 11 == 0) {
                System.out.println("Jazz");
            } else {
                System.out.println(i);
            }
        }
    }
}
