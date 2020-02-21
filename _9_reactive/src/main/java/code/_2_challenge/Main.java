package code._2_challenge;

import code._2_challenge._1_flux.FluxChallenge;
import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.Flux;

public class Main {

  public static void main(String[] args) {
    //TODO put your code changes in here

    Flux<Integer> f = Flux.just(1,2,3);
    DirectProcessor<Integer> f = DirectProcessor.create();


    f.subscribe(element -> System.out.println("as is:"+ element));
    f.subscribe(element -> System.out.println("received;"+ element));
    f.subscribe(element -> System.out.println("uite ce am primit: "+ element));
    f.onNext(1);
    f.onNext(2);
    f.onNext(3);
    f.onNext(50);

  }
}