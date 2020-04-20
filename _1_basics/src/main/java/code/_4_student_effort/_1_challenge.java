package code._4_student_effort;

import javafx.stage.Stage;

public class _1_challenge {
    //Stage 1
    public static void Stage1() {
        for (int i = 1; i <= 100; i++) {

            if (i % 15 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else System.out.println(i);
        }
    }

    //Stage 2
    public static void Stage2() {
        for (int i = 1; i <= 100; i++) {

            if (i % 77 == 0)
                System.out.println("RizzJazz");
            else if (i % 11 == 0)
                System.out.println("Jazz");
            else if (i % 7 == 0)
                System.out.println("Rizz");
            else System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Stage1();
        Stage2();
    }
}