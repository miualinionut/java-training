package code._4_student_effort;

import org.w3c.dom.ls.LSOutput;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;

public class Challenge1 {

    //return an empty flux:
   static Flux<String> emptyFlux(){
        return Flux.empty();
    }

    //return a  flux created with 2 values
    static Flux<String> fooBarFluxFromValues(){
       return Flux.just("foo","bar");
    }

    //return a flux created from a list
    static Flux<String> fooBarFluxFromList(){
        ArrayList<String> list = new ArrayList<>(Arrays.asList("foo","bar"));
        return Flux.fromIterable(list);
    }

    //return a flux that throws an exception
    static Flux<String> errorFlux(){
       return Flux.error(new IllegalStateException());
    }

    //returns a flux that emits values from 0 to 9 each 100 ms
    static Flux<Long> counter(){
      return Flux.interval(Duration.ofMillis(100)).take(10);
    }

    public static void main(String[] args) {
     Flux<String> myFlux1 = emptyFlux();
     myFlux1.subscribe(System.out::println);
     Flux<String> myFlux2 = fooBarFluxFromValues();
     myFlux2.subscribe(System.out::println);
     Flux<String> myFlux3 = fooBarFluxFromList();
     myFlux3.subscribe(System.out::println);
     Flux<String> myFlux4 = errorFlux();
     myFlux4.subscribe(System.out::println);
     Flux<Long> myFlux5 = counter();
     myFlux5.subscribe(System.out::println);

    }
}
