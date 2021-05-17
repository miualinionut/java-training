package code._4_student_effort;

import code._2_challenge._1_fizzbuzz.FizzBuzz;

public class Challange1 {


    private static void FizzBuzz(int n) {
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else if (i % 7 == 0) System.out.println("Rizz");
            else if (i % 11 == 0) System.out.println("Jazz");
            else System.out.println(i);
        }

    }

    public static void main(String[] args) {
        FizzBuzz(100);
    }
}
