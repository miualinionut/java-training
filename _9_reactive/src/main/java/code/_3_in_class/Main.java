package code._3_in_class;

import reactor.core.publisher.DirectProcessor;
import reactor.core.publisher.Flux;

public class Main {

  public static void main(String[] args) {
    DirectProcessor<Integer> f = DirectProcessor.create();

    f.subscribe(elemnet-> System.out.println("as in " + elemnet));
    f.subscribe(element -> System.out.println("received:" + element));
    f.subscribe(element -> System.out.println("uite ce-am primit:"+element));

    f.onNext(1);
    f.onNext(2);
    f.onNext(3);
    f.onNext(50);
  }
}