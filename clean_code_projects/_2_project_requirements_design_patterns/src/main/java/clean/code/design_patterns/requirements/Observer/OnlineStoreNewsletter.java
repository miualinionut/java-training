package clean.code.design_patterns.requirements.Observer;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class OnlineStoreNewsletter implements Subject{
    private Set<Observer> subscribers = new HashSet<>();

    @Override
    public void register(Observer subscriber){
        subscribers.add(subscriber);
    }

    @Override
    public void unregister(Observer subscriber){
        subscribers.remove(subscriber);
    }

    @Override
    public void notifyObservers(String message){
        for(Observer subscriber : subscribers){
            subscriber.update(message);
        }
    }

}
