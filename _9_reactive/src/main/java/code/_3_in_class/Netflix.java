package code._3_in_class;

import java.util.ArrayList;
import java.util.List;

public class Netflix implements ObservedSubject {
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void register(Observer o) {
        this.subscribers.add(o);
    }

    @Override
    public void unregister(Observer o) {
        this.subscribers.remove(o);
    }

    @Override
    public void notifyObservers(String msg) {
        for(Observer subscriber: subscribers)
            subscriber.update(msg);
    }


}
