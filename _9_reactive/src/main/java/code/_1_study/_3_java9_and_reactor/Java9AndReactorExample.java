package code._1_study._3_java9_and_reactor;

import reactor.core.publisher.DirectProcessor;

import java.util.concurrent.Flow;
import java.util.concurrent.SubmissionPublisher;

public class Java9AndReactorExample {

    public static void main(String[] args) {
        java9Flux();
        reactorFlux();
    }

    private static void reactorFlux() {
        DirectProcessor<Integer> reactorFlux = DirectProcessor.create();
        reactorFlux
                .filter(e -> e % 3 == 0) //has operators
                .subscribe(System.out::println);

        reactorFlux.onNext(10);
        reactorFlux.onNext(20);
        reactorFlux.onNext(30);
    }

    private static void java9Flux() {
        SubmissionPublisher<Integer> java9Flux = new SubmissionPublisher<>();
        java9Flux.subscribe(new Flow.Subscriber<Integer>() {
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
        java9Flux.consume(System.out::println);

        java9Flux.submit(1);
        java9Flux.submit(2);
        java9Flux.submit(3);
        java9Flux.close();
    }

}