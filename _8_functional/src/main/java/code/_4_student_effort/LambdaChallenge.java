package code._4_student_effort;
import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class LambdaChallenge {
    public void runEx() {
        System.out.println("Running ex 1 \n");
        exercise1();
        System.out.println("Running Ex 2");
        exercise2();
        System.out.println("Running Ex 3");
        exercise3();
        System.out.println("Running Ex 4");
        exercise4();
        System.out.println("Runnig ex 5");
        exercise5();
    }

    /**
     * exercise 1
     * Create a string that consists of the first letter of each word in the list
     * of Strings.
     */

    private void exercise1() {
        List<String> words = Arrays.asList("banca", "iepuras", "alb", "negru", "cutie", "alergie");
        StringBuilder a = new StringBuilder();
        words.forEach(s -> a.append(s.charAt(0)));
        String result = a.toString();
        System.out.println("Ex 1 result = " + result);
    }

    /**
     * Exercise 2
     * <p>
     * Remove the words that have odd lengths from the list.
     */
    private void exercise2() {
        List<String> words = new ArrayList<>(Arrays.asList("banca", "iepuras", "alb", "negru", "cute", "alergie"));
        words.removeIf(word -> word.length() % 2 == 1);
        words.forEach(System.out::println);
    }

    /**
     * Exercise 3
     * <p>
     * Replace every word in the list with its upper case equivalent.
     */
    private void exercise3() {
        List<String> words = new ArrayList<>(Arrays.asList("banca", "iepuras", "alb", "negru", "cute", "alergie"));
        words.replaceAll(String::toUpperCase);
        words.forEach(System.out::println);
    }
    /**
     * Exercise 4
     * <p>
     * Convert every key-value pair of the map into a string and append them all
     * into a single string, in iteration order.
     */
    private void exercise4(){
        Map<String,Integer> map = new TreeMap<>();
        map.put("c", 3);
        map.put("b", 2);
        map.put("a", 1);

        StringBuilder sb = new StringBuilder();
        map.forEach((k,v)->sb.append(String.format("%s%s", k,v)));
        String result = sb.toString();
        System.out.println("Ex4 result = "+ result);
    }
    /**
     * Exercise 5
     * <p>
     * Create a new thread that prints the numbers from the list.
     */
    private void exercise5(){
        List<Integer> list = Arrays.asList(1,2,3,4,5,5,4,3,2);
        new Thread(() -> list.forEach(System.out :: println)).start();
    }


    public static void main(String[] args) {
        LambdaChallenge ch3 = new LambdaChallenge();
        ch3.runEx();
    }

}