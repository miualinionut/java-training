package clean.code.design_patterns.requirements.stanandrei.observer;

public class Main {
    public static void main(String[] args) {
        NewsAgency newsAgency = new NewsAgency();

        Subscriber subscriber1 = new SubscriberImpl("Abonat 1");
        Subscriber subscriber2 = new SubscriberImpl("Abonat 2");
        Subscriber subscriber3 = new SubscriberImpl("Abonat 3");

        newsAgency.subscribe(subscriber1);
        newsAgency.subscribe(subscriber2);
        newsAgency.subscribe(subscriber3);

        newsAgency.publishArticle("Au aparut tantarii!");

        newsAgency.unsubscribe(subscriber2);

        newsAgency.publishArticle("S-a lansat Windows 12!");
    }
}
