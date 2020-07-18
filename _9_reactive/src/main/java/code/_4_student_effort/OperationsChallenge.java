package code._4_student_effort;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

public class OperationsChallenge {
    private static List<String> words = Arrays.asList(
            "the",
            "quick",
            "brown",
            "fox",
            "jumped",
            "over",
            "the",
            "lazy",
            "dog"
    );

    public static void main(String[] args) {
        System.out.println("Displaying Letters \n");
        displayingLetters();
        System.out.println("Finding the missing Letter \n");
        findingMissingLetter();
        System.out.println("Restoring the missing Letter \n");
        restoringMissingLetter();

    }

    static void displayingLetters() {
        Flux<String> letters = Flux
                .fromIterable(words)
                .flatMap(word -> Flux.fromArray(word.split("")))
                .zipWith(Flux.range(1, Integer.MAX_VALUE), (string, count) -> String.format("%2d. %s", count, string));

        letters.subscribe(System.out::println);

    }

    static void findingMissingLetter() {
        Flux<String> letters = Flux
                .fromIterable(words)
                .flatMap(word -> Flux.fromArray(word.split("")))
                .distinct()
                .sort()
                .zipWith(Flux.range(1, Integer.MAX_VALUE), (string, count) -> String.format("%2d. %s", count, string));

        letters.subscribe(System.out::println);

    }

    static void restoringMissingLetter() {
        Mono<String> missing  = Mono.just("s");

        Flux<String> allLetters = Flux
                .fromIterable(words)
                .flatMap(word -> Flux.fromArray(word.split("")))
                .concatWith(missing)
                .distinct()
                .sort()
                .zipWith(Flux.range(1, Integer.MAX_VALUE), (string, count) -> String.format("%2d. %s", count, string));

        allLetters.subscribe(System.out::println);
    }
}
