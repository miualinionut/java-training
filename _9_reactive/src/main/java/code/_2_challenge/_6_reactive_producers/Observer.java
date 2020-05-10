package code._2_challenge._6_reactive_producers;

public interface Observer<T> {
    void receiveNotification(T message);
}
