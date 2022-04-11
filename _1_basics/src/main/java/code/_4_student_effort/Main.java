package code._4_student_effort;

import code._2_challenge._1_fizzbuzz.FizzBuzz;

public class Main {
    public static void main(String[] args) {
        Challenge challenge = new Challenge();
        challenge.FizzBuzz();
        // FooBarQix
        for(int i = 1; i <= 53; i++)
            System.out.println(challenge.compute(i));

    }
}
