package code._4_student_effort;

import reactor.core.publisher.Mono;

public class MonoChallenge {
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
