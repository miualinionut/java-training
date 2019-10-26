package code._2_challenge._2_mono;

import reactor.core.publisher.Mono;

public class MonoChallenge {
    public static void main(String[] args) {
        emptyMono().subscribe(System.out::println);
        System.out.println();

        monoWithNoSignal().subscribe(System.out::println);
        System.out.println();

        fooMono().subscribe(System.out::println);
        System.out.println();

        errorMono().subscribe(System.out::println);
        System.out.println();
    }

    // Return an empty Mono
    static Mono<String> emptyMono() {
        return Mono.empty();
    }

    // Return a Mono that never emits any signal
    static Mono<String> monoWithNoSignal() {
        return Mono.never();
    }

    // Return a Mono that contains a "foo" value
    static Mono<String> fooMono() {
        return Mono.just("foo");
    }

    // Create a Mono that emits an IllegalStateException
    static Mono<String> errorMono() {
        return Mono.error(new IllegalStateException());
    }
}
