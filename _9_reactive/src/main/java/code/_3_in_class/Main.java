package code._3_in_class;

import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.Flux;

import java.security.spec.RSAOtherPrimeInfo;

public class Main {

  public static void main(String[] args) {

    DirectProcessor<Integer> f = DirectProcessor.create();

    f.subscribe(element -> System.out.println("as if " + element));
    f.subscribe(element -> System.out.println("received" + element));
    f.subscribe(element -> System.out.println("uite de am primit " + element));

    f.onNext(1);
    f.onNext(2);
    f.onNext(3);
    f.onNext(50);


   }
}