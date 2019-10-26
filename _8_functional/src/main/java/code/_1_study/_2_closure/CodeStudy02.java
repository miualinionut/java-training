package code._1_study._2_closure;

import java.util.function.Function;

public class CodeStudy02 {
    public static void main(String[] args) {
        final String hello = "Hello, ";
        Function<String, String> helloFunction = (name) -> hello + name;

        System.out.println(helloFunction.apply("John"));
        System.out.println(helloFunction.apply("Anastasia"));
    }
}
