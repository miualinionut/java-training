package code._4_student_effort;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class FluxInReactor {

    // Return an empty flux
    Flux<String> emptyFlux() {
        return Flux.empty();
    }

    // Return a flux that contains 2 values "foo" and "bar" without using an array or a collection
    Flux<String> fooBarFluxFromValues() {
        return Flux.just("foo", "Bar");
    }

    // Create a flux from a list that contains 2 values "foo" and "bar
    Flux<String> fooBarFluxFromList() {
        List<String> list = new ArrayList<>();
        list.add("foo");
        list.add("Bar");
        return Flux.fromIterable(list);
    }

    // Create a flux that emits an IllegalStateException
    Flux<String> errorFlux() {
        return Flux.error(new IllegalStateException());
    }

    // Create a flux that emits an increasing values from 0 to 9 each 100ms
    Flux<Long> counter() {
        return Flux.interval(Duration.ofMillis(100)).take(10);
    }

    public static void main(String[] args) {
        FluxInReactor f = new FluxInReactor();
        f.emptyFlux().subscribe(System.out::println);
        System.out.println();

        f.fooBarFluxFromValues().subscribe(System.out::println);
        System.out.println();

        f.fooBarFluxFromList().subscribe(System.out::println);
        System.out.println();

        f.counter().subscribe(System.out::println);
        System.out.println();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        f.errorFlux().subscribe(System.out::println);
        System.out.println();
    }




}
