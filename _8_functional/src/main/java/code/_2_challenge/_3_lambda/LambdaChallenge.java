package code._2_challenge._3_lambda;

import java.util.*;

public class LambdaChallenge {
    /**
     * Run the exercises to ensure we got the right answers
     */
    public void runExercises() {
        System.out.println("Running exercise 1 solution...");
        exercise1();
        System.out.println("Running exercise 2 solution...");
        exercise2();
        System.out.println("Running exercise 3 solution...");
        exercise3();
        System.out.println("Running exercise 4 solution...");
        exercise4();
        System.out.println("Running exercise 5 solution...");
        exercise5();
    }

    /**
     * All exercises should be completed using Lambda expressions and the new
     * methods added to JDK 8 where appropriate. There is no need to use an
     * explicit loop in any of the code. Use method references rather than full
     * lambda expressions wherever possible.
     */
    /**
     * Exercise 1
     * <p>
     * Create a string that consists of the first letter of each word in the list
     * of Strings.
     */
    private void exercise1() {
        List<String> words = Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

        StringBuilder sb = new StringBuilder();
        words.forEach(s -> sb.append(s.charAt(0)));
        String result = sb.toString();
        System.out.println("Exercise 1 result = " + result);
    }

    /**
     * Exercise 2
     * <p>
     * Remove the words that have odd lengths from the list.
     */
    private void exercise2() {
        List<String> words = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

        words.removeIf(word -> word.length() % 2 == 1);
        words.forEach(System.out::println);
    }

    /**
     * Exercise 3
     * <p>
     * Replace every word in the list with its upper case equivalent.
     */
    private void exercise3() {
        List<String> words = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
        words.replaceAll(String::toUpperCase);
        words.forEach(System.out::println);
    }

    /**
     * Exercise 4
     * <p>
     * Convert every key-value pair of the map into a string and append them all
     * into a single string, in iteration order.
     */
    private void exercise4() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("c", 3);
        map.put("b", 2);
        map.put("a", 1);

        StringBuilder sb = new StringBuilder();
        map.forEach((k, v) -> sb.append(String.format("%s%s", k, v)));
        String result = sb.toString();
        System.out.println("Exercise 4 result = " + result);
    }

    /**
     * Exercise 5
     * <p>
     * Create a new thread that prints the numbers from the list.
     */
    private void exercise5() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        new Thread(() -> list.forEach(System.out::println)).start();
    }

    /**
     * Main entry point for application
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LambdaChallenge challenge03 = new LambdaChallenge();
        challenge03.runExercises();
    }
}
