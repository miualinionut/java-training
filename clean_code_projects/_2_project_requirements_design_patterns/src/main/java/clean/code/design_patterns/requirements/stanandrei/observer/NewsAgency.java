package clean.code.design_patterns.requirements.stanandrei.observer;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency {
    private final List<Subscriber> subscribers = new ArrayList<>();

    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void publishArticle(String articleTitle) {
        System.out.println("Se publica un nou articol: " + articleTitle);
        notifySubscribers(articleTitle);
    }

    private void notifySubscribers(String articleTitle) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(articleTitle);
        }
    }
}
