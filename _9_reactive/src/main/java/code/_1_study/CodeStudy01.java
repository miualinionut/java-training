package code._1_study;

import reactor.core.publisher.DirectProcessor;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class CodeStudy01 {

    public static void main(String[] args) {
        //java9
        SubmissionPublisher<Integer> sp = new SubmissionPublisher<>();
        sp.subscribe(new Flow.Subscriber<Integer>() {
            private Flow.Subscription subscription;

            @Override
            public void onSubscribe(Flow.Subscription subscription) {
                this.subscription = subscription;
                subscription.request(1);
                System.out.println("waiting for elements ...");
            }

            @Override
            public void onNext(Integer item) {
                System.out.println("received: " + item);
                this.subscription.request(1);
            }

            @Override
            public void onError(Throwable throwable) {
                System.err.println(throwable.getMessage());
            }

            @Override
            public void onComplete() {
                System.out.println("completed");
            }
        });
        sp.consume(System.out::println);

        sp.submit(1);
        sp.submit(2);
        sp.submit(3);
        sp.close();

        //reactor
        DirectProcessor<Integer> f = DirectProcessor.create();
        f
                .filter(e -> e % 3 == 0) //has operators
                .subscribe(System.out::println);

        f.onNext(10);
        f.onNext(20);
        f.onNext(30);
    }

}