package code._4_student_effort.challenge_1;

import java.sql.SQLOutput;

public class FizzBuzz {
    public void solveStageTwo() {
        NumberToWord[] numberToWords = {
                new NumberToWord(3, "Fizz"),
                new NumberToWord(5, "Buzz"),
                new NumberToWord(7, "Rizz"),
                new NumberToWord(11, "Jazz")
        };

        for (int i = 1; i <= 100; i++) {
            String s = "";
            boolean correlation = false;
            for (NumberToWord it: numberToWords) {
                if (i % it.getNumber() == 0) {
                    correlation = true;
                    s += it.getWord();
                }
            }
            if (!correlation)
                s += String.valueOf(i);
            System.out.print(s);
            if (i < 100)
                System.out.print(", ");
        }
    }
}
