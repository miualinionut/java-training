package code._4_student_effort;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
                continue;
            }
            if (i%3==0) {
                System.out.println("Fizz");
                continue;
            }
            if (i%5==0) {
                System.out.println("Buzz");
                continue;
            }
            if (i%7==0) {
                System.out.println("Rizz");
                continue;
            }
            if (i%11==0) {
                System.out.println("Jazz");
                continue;
            }
            System.out.println(i);
        }
    }
}
