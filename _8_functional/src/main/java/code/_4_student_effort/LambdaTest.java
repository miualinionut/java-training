package code._4_student_effort;

import java.util.*;

public class LambdaTest {

    /*
     * Exercise 1
     * Create a string that consists of the first letter of each word in the list
     * of Strings.
     */
    private void exercise1() {
        List<String> words = new ArrayList<>(Arrays.asList("Java", "Developer", "Keen"));

        StringBuilder s = new StringBuilder();

//        words.stream().forEach(word -> s.append(word.charAt(0)));
        words.forEach(word -> s.append(word.charAt(0)));

        System.out.println("Exercise 1: " + s.toString());
    }

    /*
     * Exercise 2
     * Remove the words that have odd lengths from the list.
     */
    private void exercise2() {
        List<String> words = new ArrayList<>(Arrays.asList("Java", "Developer", "Keen", "odd"));
        System.out.println("Exercise 2: ");

        words.stream().filter(word -> word.length() % 2 == 0)
                .forEach(System.out::println);

//        words.removeIf(word -> word.length() % 2 != 0);
//        words.forEach(System.out::println);

    }

    /*
     * Exercise 3
     * Replace every word in the list with its upper case equivalent.
     */
    private void exercise3() {
        List<String> words = new ArrayList<>(Arrays.asList("Java", "Developer", "Keen", "odd"));
        System.out.println("Exercise 3: ");
        words.stream().map(String::toUpperCase)
                .forEach(System.out::println);
    }

    /*
     * Exercise 4
     * Convert every key-value pair of the map into a string and append them all
     * into a single string, in iteration order.
     */
    private void exercise4() {
        Map<String, Integer> map = new HashMap<>();
        map.put("java", 1);
        map.put("Developer", 2);
        map.put("keen", 3);
        map.put("odd", 4);

        StringBuilder s = new StringBuilder();

        map.forEach((key, value) -> s.append(key).append(" ")
                .append(value.toString()).append("\n"));

        System.out.println("Exercise 4: ");
        System.out.println(s);
    }

    private void exercise5() {
        List<String> words = new ArrayList<>(Arrays.asList("Java", "Developer", "Keen", "odd"));
        System.out.println("Exercise 5 ");

        new Thread(() -> words.forEach(System.out::println)).start();
    }

    public static void main(String[] args) {
        LambdaTest l = new LambdaTest();
        l.exercise1();
        l.exercise2();
        l.exercise3();
        l.exercise4();
        l.exercise5();

    }
}
