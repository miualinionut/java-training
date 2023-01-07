package clean.code.design_patterns.requirements.observer_pattern;

import java.util.ArrayList;

public class Publisher {
    private String name;
    private ArrayList<Subscriber> subscribers = new ArrayList<>();
    private ArrayList<Magazine> magazines = new ArrayList<>();

    public Publisher(String name) {
        this.name = name;
    }

    public void addSubscriber(Subscriber subscriber) {
        if (!subscribers.contains(subscriber))
            subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    private void notifySubscribers(Magazine magazine) {
        for (Subscriber subscriber: subscribers)
            subscriber.update(magazine);
    }

    public void publishMagazine(String title, int nrOfPages, int publicationYear) {
        Magazine magazine = new Magazine(title, nrOfPages, publicationYear);
        magazines.add(magazine);
        notifySubscribers(magazine);
    }
}
