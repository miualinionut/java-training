package code._1_study._2_create_mono;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Random;
import java.util.concurrent.CompletableFuture;

public class CreateMonoExample {
    public static void main(String[] args) {
        // Creating a Mono containing "Hello World !".
        Mono<String> helloWorld = Mono.just("Hello World !");

        // Creating an empty Mono
        Mono<String> empty = Mono.empty();

        // Creating from a Flux.
        Mono<Integer> monoFromFlux = Mono.from(Flux.range(1, 10));
        // The above Mono contains the first value of the Flux.
    }
}
