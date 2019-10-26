package code._1_study._1_create_flux;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateFluxExample {
    public static void main(String[] args) {
        // Creates a Flux containing the values 1, 2, 3.
        Flux<Integer> integerFlux = Flux.just(1, 2, 3);

        // Creates a Flux containing "Hello", "foo" and "bar".
        Flux<String> stringFlux = Flux.just("Hello", "foo", "bar");

        // Creates a Flux from an already existing Iterable, for example a List.
        List<String> stringList = Arrays.asList("Hello", "foo", "bar");
        Flux<String> fluxFromList = Flux.fromIterable(stringList);

        // It works the same with Java Streams (which are not reactive).
        Stream<String> stringStream = stringList.stream();
        Flux<String> fluxFromStream = Flux.fromStream(stringStream);

        // Creates a flux on a range.
        Flux<Integer> rangeFlux = Flux.range(1, 5); // Flux(1, 2, 3, 4, 5)

        // Creates a flux that generates a new value every 100 ms.
        // The value is incremental, starting at 1.
        Flux<Long> intervalFlux = Flux.interval(Duration.ofMillis(100));

        // You can also create a Flux from another one, or from a Mono.
        Flux<String> fluxCopy = Flux.from(fluxFromList);
    }
}
