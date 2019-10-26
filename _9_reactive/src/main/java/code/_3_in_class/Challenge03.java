package code._3_in_class;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;

public class Challenge03 {
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
        System.out.println("displayingLetters \n");
        displayingLetters();

        System.out.println("\nfindingMissingLetter \n");
        findingMissingLetter();

        System.out.println("\nrestoringMissingLetter \n");
        restoringMissingLetter();
    }

    // TODO display the letters from the words list and count them
    // 1. t
    // 2. h
    // 3. e
    static void displayingLetters() {
        Flux<String> letters = Flux.fromIterable(words)
                .flatMap(word -> Flux.fromArray(word.split("")))
                .zipWith(Flux.range(1, Integer.MAX_VALUE),
                        (string, count) -> String.format("%2d. %s", count, string));
        letters.subscribe(System.out::println);

    }

    // TODO find the missing letter from the words list
    // use the same way like on displayingLetters to display the result
    static void findingMissingLetter() {
        Flux<String> letters = Flux.fromIterable(words)
                .flatMap(word -> Flux.fromArray(word.split("")))
                .distinct()
                .sort()
                .zipWith(Flux.range(1, Integer.MAX_VALUE),
                        (string, count) -> String.format("%2d. %s", count, string));
        letters.subscribe(System.out::println);
    }

    // TODO restore the missing letter from the words list
    // use the same way like on displayingLetters to display the result
    static void restoringMissingLetter() {
        Mono<String> missingLetter = Mono.just("s");
        Flux<String> letters = Flux.fromIterable(words)
                .flatMap(word -> Flux.fromArray(word.split("")))
                .concatWith(missingLetter)
                .distinct()
                .sort()
                .zipWith(Flux.range(1, Integer.MAX_VALUE),
                        (string, count) -> String.format("%2d. %s", count, string));
        letters.subscribe(System.out::println);

    }
}