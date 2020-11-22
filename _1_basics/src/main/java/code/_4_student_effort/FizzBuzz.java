package code._4_student_effort;

public class FizzBuzz {
    /* prints the numbers from 1 to 100
       but for multiples of
            * 3 prints "Fizz"
            * 5 prints "Buzz"
            * both (3 & 5) prints "FizzBuzz"
            * 7 prints "Rizz"
            * 11 prints "Jazz"
     */

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print("Fizz, ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz, ");
            } else if (i % 5 == 0 && i % 3 == 0) {
                System.out.print("FizzBuzz, ");
            } else if (i % 7 == 0) {
                System.out.print("Rizz, ");
            } else if (i % 11 == 0) {
                System.out.print("Jazz, ");
            } else {
                if (i < 100) {
                    System.out.print(i + ", ");
                } else {
                    System.out.println(i);
                }
            }
        }
    }
}
