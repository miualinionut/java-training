package code._4_student_effort;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

public class OperationsInReactor {
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

    // display the letters from the words list and count them
    static void displayingLetters() {
        Flux<String> letters = Flux
                .fromIterable(words)
                .flatMap(word -> Flux.fromArray(word.split("")))
                .zipWith(Flux.range(1, Integer.MAX_VALUE),
                        (string, count) -> String.format("%2d. %s", count, string));

        letters.subscribe(System.out::println);
    }

    // find the missing letter from the words list
    // use the same way like on displayingLetters to display the result
    static void findingMissingLetter() {
        Flux<String> letters = Flux
                .fromIterable(words)
                .flatMap(word -> Flux.fromArray(word.split("")))
                .distinct()
                .sort()
                .zipWith(Flux.range(1, Integer.MAX_VALUE),
                        (string, count) -> String.format("%2d. %s", count, string));
        letters.subscribe(System.out::println);

    }

    // find the missing letter from the words list
    // use the same way like on displayingLetters to display the result
    static void restoringMissingLetter() {
        Mono<String> m = Mono.just("s");

        Flux<String> letters = Flux
                .fromIterable(words)
                .flatMap(word -> Flux.fromArray(word.split("")))

                .concatWith(m)
                .distinct()
                .sort()
                .zipWith(Flux.range(1, Integer.MAX_VALUE),
                        (string, count) -> String.format("%2d. %s", count, string));
        letters.subscribe(System.out::println);

    }

    public static void main(String[] args) {
        System.out.println("displayingLetters");
        displayingLetters();

        System.out.println("\nfindingMissingLetter");
        findingMissingLetter();

        System.out.println("\nrestoringMissingLetter");
        restoringMissingLetter();
    }

}
