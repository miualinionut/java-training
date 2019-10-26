package code._2_challenge._1_flux;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;

public class FluxChallenge {
    public static void main(String[] args) {
        emptyFlux().subscribe(System.out::println);
        System.out.println();

        fooBarFluxFromValues().subscribe(System.out::println);
        System.out.println();

        fooBarFluxFromList().subscribe(System.out::println);
        System.out.println();

        counter().subscribe(System.out::println);
        System.out.println();
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        errorFlux().subscribe(System.out::println);
        System.out.println();
    }

    // Return an empty Flux
    static Flux<String> emptyFlux() {
        return Flux.empty();
    }

    // Return a Flux that contains 2 values "foo" and "bar" without using an array or a collection
    static Flux<String> fooBarFluxFromValues() {
        return Flux.just("foo", "bar");
    }

    // Create a Flux from a List that contains 2 values "foo" and "bar"
    static Flux<String> fooBarFluxFromList() {
        return Flux.fromIterable(Arrays.asList("foo", "bar"));
    }

    // Create a Flux that emits an IllegalStateException
    static Flux<String> errorFlux() {
        return Flux.error(new IllegalStateException());
    }

    // Create a Flux that emits increasing values from 0 to 9 each 100ms
    static Flux<Long> counter() {
        return Flux.interval(Duration.ofMillis(100)).take(10);
    }
}