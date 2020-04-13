package code._3_in_class;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import reactor.core.publisher.DirectProcessor;

public class Main {

  public static void main(String[] args) {
    DirectProcessor<Integer> f = DirectProcessor.create();


    f.log().subscribe(new Subscriber<Integer>() {
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
        //? ce se va intampla cand cei 2 covrigi au fost deja consumati ?
        if(this.nrConsumedValues==2) {
          this.subscription.request(2);
          this.nrConsumedValues = 0;
        }
      }

      @Override
      public void onError(Throwable throwable) {

      }

      @Override
      public void onComplete() {
        System.out.println("GATA!!!");
      }
    });
    f.onNext(1);
    f.onNext(2);
    f.onNext(3);
    f.onNext(4);
    f.onNext(5);
    f.onComplete();

  }
}