package code._2_challenge._6_reactive_producers.reactor;

import code._2_challenge._6_reactive_producers.Observed;
import code._2_challenge._6_reactive_producers.Observer;
import reactor.core.publisher.FluxProcessor;

import java.util.function.Consumer;

public class NetflixUsingReactor<T> implements Observed<T> {
    private final FluxProcessor<T, T> processor;

    public NetflixUsingReactor(FluxProcessor<T, T> processor) {
        this.processor = processor;
    }

    public void subscribe(Observer<T> observer) {
        Consumer<T> consumerReference = observer::receiveNotification;
        this.processor.subscribe(consumerReference); //subscribe can receive a Consumer functional interface or a org.reactivestreams.Subscriber
    }

    public void notifyObservers(T message) {
        this.processor.onNext(message);
    }

}