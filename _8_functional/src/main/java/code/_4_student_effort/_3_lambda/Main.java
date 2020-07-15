package code._4_student_effort._3_lambda;

import java.util.*;

public class Main {
    public static void main(String[] args) {
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

    public static void exercise1(){
        List<String> words = Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

        StringBuilder sb = new StringBuilder();
        words.forEach(s -> sb.append(s.charAt(0)));
        String result = sb.toString();
        System.out.println("Ex1 result = " + result);
    }

    public static void exercise2(){
        List<String> words = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

        words.removeIf(word -> word.length() % 2 == 1);
        words.forEach(System.out::println);
    }

    public static void exercise3() {
        List<String> words = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
        words.replaceAll(String::toUpperCase);
        words.forEach(System.out::println);
    }

    public static void exercise4() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("c", 3);
        map.put("b", 2);
        map.put("a", 1);

        StringBuilder sb = new StringBuilder();
        map.forEach((k, v) -> sb.append(String.format("%s%s", k, v)));
        String result = sb.toString();
        System.out.println("Exercise 4 result = " + result);
    }

    public static void exercise5() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        new Thread(() -> list.forEach(System.out::println)).start();
    }
}
