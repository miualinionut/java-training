package code._2_challenge._6_reactive_producers;

public interface Observed<T> {
    void subscribe(Observer<T> observer);

    void notifyObservers(T message);
}
