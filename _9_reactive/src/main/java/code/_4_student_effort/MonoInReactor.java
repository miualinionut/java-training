package code._4_student_effort;

import reactor.core.publisher.Mono;

public class MonoInReactor {

    // Return an empty Mono
    Mono<String> emptyMono() {
        return Mono.empty();
    }

    // Return a Mono that never emits any signal
    Mono<String> monoWithNoSignal() {
        return Mono.never();
    }

    // Return a Mono that contains a "foo" value
    Mono<String> fooMono() {
        return Mono.just("foo");
    }

    // Create a Mono that emits an IllegalStateException
    Mono<String> errorMono() {
        return Mono.error(IllegalStateException::new);
    }

    public static void main(String[] args) {
        MonoInReactor m = new MonoInReactor();

        m.emptyMono().subscribe(System.out::println);
        System.out.println();

        m.monoWithNoSignal().subscribe(System.out::println);
        System.out.println();

        m.fooMono().subscribe(System.out::println);
        System.out.println();

        m.errorMono().subscribe(System.out::println);
        System.out.println();
    }
}
