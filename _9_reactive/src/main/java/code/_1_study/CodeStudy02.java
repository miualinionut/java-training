package code._1_study;

import java.util.stream.IntStream;

public class CodeStudy02 {
    public static void main(String[] args) {
        int factor = 2;
        IntStream s = IntStream
                .range(0, 10)
                .map(e -> {
                    System.out.println("multiplying for: " + e);
                    return e * factor;
                })
                .filter(e -> e > 5);
        //factor = 5; //immutability: what will be the result if we will be able to mutate this ?
        int first = s.findFirst().getAsInt(); //lazy evaluation: we don't need to multiply all numbers to get the first
        System.out.println("first: " + first);
    }
}
