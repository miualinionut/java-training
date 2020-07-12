package code._4_student_effort;

import java.util.*;

public class Lambda_ch {
    private void exercise1() {
        List<String> words = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

        StringBuilder sb = new StringBuilder();
        words.forEach(s -> sb.append(s.charAt(0)));
        String ex = sb.toString();
        System.out.println(ex);
    }
    private void exercise2() {
        List<String> words = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));

        words.removeIf(word -> word.length() % 2 == 1);
        words.forEach(System.out::println);
    }
    private void exercise3() {
        List<String> words = new ArrayList<>(Arrays.asList(
                "alpha", "bravo", "charlie", "delta", "echo", "foxtrot"));
        words.replaceAll(String::toUpperCase);
        words.forEach(System.out::println);
    }
    private void exercise4() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("c", 3);
        map.put("b", 2);
        map.put("a", 1);

        StringBuilder sb = new StringBuilder();
        map.forEach((k, v) -> sb.append(String.format("%s%s", k, v)));
        String ex = sb.toString();
        System.out.println(ex);
    }
    private void exercise5() {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        new Thread(() -> list.forEach(System.out::println)).start();
    }
    public static void main(String[] args) {
        Lambda_ch challenge = new Lambda_ch();
        System.out.println("Exercise 1: ");
        challenge.exercise1();
        System.out.println("Exercise 2: ");
        challenge.exercise2();
        System.out.println("Exercise 3: ");
        challenge.exercise3();
        System.out.println("Exercise 4: ");
        challenge.exercise4();
        System.out.println("Exercise 5: ");
        challenge.exercise5();
    }

}
