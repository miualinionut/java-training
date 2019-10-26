package code._1_study._4_lazy_evaluation_and_immutability;

import java.util.stream.IntStream;

public class LazyEvaluationAndImmutabilityExample {
    public static void main(String[] args) {
        int factor = 2;
        IntStream stream = IntStream.range(0, 10)
                .map(e -> {
                    System.out.println("multiplying for: " + e);
                    return e * factor;
                })
                .filter(e -> e > 5);
        //immutability: what will be the result if we will be able to mutate this ?
        //factor = 5;

        //lazy evaluation: we don't need to multiply all numbers to get the first
        int first = stream.findFirst().getAsInt();
        System.out.println("first: " + first);
    }
}
