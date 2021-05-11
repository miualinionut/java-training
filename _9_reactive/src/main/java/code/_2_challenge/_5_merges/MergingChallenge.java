package code._2_challenge._5_merges;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class MergingChallenge {
    private static List<String> words1 = Arrays.asList(
            "alpha", "bravo", "charlie", "delta", "echo", "foxtrot");

    private static List<String> words2 = Arrays.asList(
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
        System.out.println("mergeFluxWithInterleave\n");
        Flux<String> flux1 = Flux.fromIterable(words1).delayElements(Duration.ofMillis(500L));
        Flux<String> flux2 = Flux.fromIterable(words2).delayElements(Duration.ofMillis(300L));
        //Flux<String> flux1 = Flux.fromIterable(words1);
        //Flux<String> flux2 = Flux.fromIterable(words2);
        mergeFluxWithInterleave(flux1, flux2).subscribe(System.out::println);
        try {
            Thread.sleep(3500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("\nmergeFluxWithNoInterleave\n");
        mergeFluxWithNoInterleave(Flux.fromIterable(words1), Flux.fromIterable(words2)).subscribe(System.out::println);

        System.out.println("\ncreateFluxFromMultipleMono\n");
        createFluxFromMultipleMono(Mono.just(words1.get(0)), Mono.just(words2.get(0))).subscribe(System.out::println);
    }

    // Merge flux1 and flux2 values with interleave
    // An interesting thing to note is that, opposed to concat (lazy subscription), the sources are subscribed eagerly.
    static Flux<String> mergeFluxWithInterleave(Flux<String> flux1, Flux<String> flux2) {
        return flux1.mergeWith(flux2);
    }

    // Merge flux1 and flux2 values with no interleave (flux1 values and then flux2 values)
    static Flux<String> mergeFluxWithNoInterleave(Flux<String> flux1, Flux<String> flux2) {
        return flux1.concatWith(flux2);
    }

    // Create a Flux containing the value of mono1 then the value of mono2
    static Flux<String> createFluxFromMultipleMono(Mono<String> mono1, Mono<String> mono2) {
        return Flux.concat(mono1, mono2);
    }
}
