package code._3_in_class;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.Flux;
import reactor.core.publisher.DirectProcessor;

public class Main {

  public static void main(String[] args) {
    // programare reactive - bun pt problemele tip subcriber si subcription

    //Observer

    // flux combina observer-ul cu operatorii interni din programare functionala

//    Flux<Integer> f = Flux.just(1,2,3); // publisher
//
//    f       .map(element -> element * 10)
//            .map(element -> element /5)
//            .filter(element -> element % 3 == 0)
//            .subscribe(element -> System.out.println("as is: " + element));
//    f.subscribe(element -> System.out.println("received: " + element)); // subscriere, si in baza acesteia fluxul primeste o subscribtie
//    f.subscribe(element -> System.out.println("uite ce-am primit: " + element));
    // producator + consumator = procesator

    // diferenta dintre cele doua

    DirectProcessor<Integer> p = DirectProcessor.create(); // factory - un design pattern

//    p.subscribe(element -> System.out.println("as is: " + element));
//    p.subscribe(element -> System.out.println("received: " + element));
//    p.subscribe(element -> System.out.println("uite ce-am primit " + element));
//
//    p.onNext(1);
//    p.onNext(2);
//    p.onNext(3);
//    p.onNext(50);

    //sau asa
//    p.onNext(1);
//    p.onNext(2);
//    p.subscribe(element -> System.out.println("as is: " + element)); // tu esti asta, daca nu esti la televizor ai pierdut desenele
//    p.onNext(3);
//    p.onNext(50);



    // mai e si fenomenul de back pressure - > magazin covrigi,
    // cand vinzi un covrgi mai faci 3 ca sa nu ramai nici cu multi care nu se vand,
    // dar nici sa nu-i faci pe oameni sa astepte dupa covrigi

  p.log().subscribe(new Subscriber<Integer>() {
    private Subscription subscription;
    private long nrConsumedValues = 0;
    @Override
    public void onSubscribe(Subscription subscription) {
      this.subscription = subscription;
      this.subscription.request(2);
      this.nrConsumedValues = 0;
    }

    @Override
    public void onNext(Integer integer) {

      System.out.println(integer);
      this.nrConsumedValues++;
      if(this.nrConsumedValues==2){
        this.subscription.request(2);
        this.nrConsumedValues = 0;
      }

    }

    @Override
    public void onError(Throwable throwable) {

    }

    @Override
    public void onComplete() {
      System.out.println("GATAA");
    }
  });

  p.onNext(1);
  p.onNext(2);
    p.onNext(3);
    p.onNext(4);
    p.onNext(5);
  }
}