package code._4_student_effort;

import reactor.core.publisher.Mono;

public class Challenge2 {

  //return an empty mono:
  static Mono<String> epmtyMono(){
    return Mono.empty();
  }

  //a mono that never emits any signal:
  static Mono<String> monoWithNoSignal(){
    return Mono.never();
  }

  //a mono that contains a foo value
  static Mono<String> fooMono(){
    return Mono.just("foo");
  }

  //mono care emite IllegalStateException
  static Mono<String> errorMono(){
    return Mono.error(new IllegalStateException());
  }

  public static void main(String[] args) {

    Mono<String> myMono1 = epmtyMono();
    myMono1.subscribe(System.out::println);

    monoWithNoSignal().subscribe(System.out::println);

    fooMono().subscribe(System.out::println);

    errorMono().subscribe(System.out::println);
  }
}
