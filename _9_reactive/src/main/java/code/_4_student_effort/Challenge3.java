package code._4_student_effort;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Challenge3 {

    private static List<String> words = Arrays.asList(
            "the", "quick", "brown", "fox", "jumped", "over", "the", "lazy", "dog"
    );

    public static void displayLetters() {
        Flux<String> myFlux = Flux.fromIterable(words);
        Flux<String> finalFlux = myFlux.flatMap(words -> Flux.fromArray(words.split("")).
                zipWith(Flux.range(1,Integer.MAX_VALUE), (str, nr) -> String.format("%2d. %s", nr, str)));
        finalFlux.subscribe(System.out::println);
    }

    public static void findingMissingLetter(){
        Flux<String> myFlux = Flux.fromIterable(words).flatMap( words -> Flux.fromArray(words.split("")))
                .distinct().sort()
                .zipWith(Flux.range(1,Integer.MAX_VALUE), (str, nr) -> String.format("%2d. %s", nr, str));

        myFlux.subscribe(System.out::println);
    }

    public static void restoreMissingLetter(){
        Mono<String> mono = Mono.just("s");
        Flux<String> myFlux = Flux.fromIterable(words).flatMap(words -> Flux.fromArray(words.split(""))).distinct()
                .concatWith(mono).zipWith(Flux.range(1,Integer.MAX_VALUE), (str, nr) -> String.format("%2d. %s", nr, str));
        myFlux.subscribe(System.out::println);
    }
    

    public static void main(String[] args) {

        displayLetters();
        findingMissingLetter();
        restoreMissingLetter();
    }
}
