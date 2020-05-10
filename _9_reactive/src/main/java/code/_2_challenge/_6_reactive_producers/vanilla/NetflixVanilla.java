package code._2_challenge._6_reactive_producers.vanilla;

import code._2_challenge._6_reactive_producers.Observed;
import code._2_challenge._6_reactive_producers.Observer;

import java.util.ArrayList;
import java.util.List;

public class NetflixVanilla<T> implements Observed<T> {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void notifyObservers(T message) {
        for(Observer o: observers) {
            o.receiveNotification(message);
        }
    }
}
