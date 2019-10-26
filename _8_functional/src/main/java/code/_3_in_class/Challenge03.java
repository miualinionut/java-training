package code._3_in_class;

import java.util.*;

public class Challenge03 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private static void exercise1() {
        List<String> words = Arrays.asList("apple", "cat", "water", "java");
        StringBuilder stringBuilder = new StringBuilder();
        words.forEach(word -> stringBuilder.append(word.charAt(0)));
        System.out.println("The resulted word is: " + stringBuilder.toString());
    }

    private static void exercise2() {
        List<String> words =new ArrayList<>(Arrays.asList("apple", "cat", "water", "java"));
        words.removeIf(word -> word.length() % 2 == 1);
        words.forEach(System.out::println);
    }

    private static void exercise3() {
        List<String> words =new ArrayList<>(Arrays.asList("apple", "cat", "water", "java"));
        words.replaceAll(word -> word.toUpperCase());
        words.forEach(System.out::println);
    }

    private static void exercise4() {
        Map<String, String> map = new HashMap<>();
        map.put("a", "b");
        map.put("c", "d");
        map.put("e", "f");
        StringBuilder stringBuilder = new StringBuilder();
        map.forEach((k, v) -> stringBuilder.append(k).append(v));
        System.out.println("Result = " + stringBuilder.toString());
    }

    private static void exercise5() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        new Thread(()->numbers.forEach(System.out::println)).start();
    }
}
