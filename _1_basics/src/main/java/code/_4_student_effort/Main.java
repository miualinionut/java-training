package code._4_student_effort;
import java.util.ArrayList;
import java.util.Arrays;

import main.java.code._4_student_effort.Challenge;

public class Main {
    public static void main(String[] args) {
        Challenge challenge = new Challenge();
        challenge.FizzBuzz();
        // FooBarQix
        for (int i = 1; i <= 53; i++)
            System.out.println(challenge.compute(i));

        // Pairs of two
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(2, 3, -3, -2, 3, 0, 2, 2, -1, -3));
        System.out.println("nr of pairs: " + challenge.pairsOf2(numbers));

        ArrayList<Integer> numbers2 = new ArrayList<Integer>();
        numbers2.addAll(Arrays.asList(-1, -1, -1, 2, 0));
        System.out.println("nr of pairs: " + challenge.pairsOf3(numbers2));
    }
}
