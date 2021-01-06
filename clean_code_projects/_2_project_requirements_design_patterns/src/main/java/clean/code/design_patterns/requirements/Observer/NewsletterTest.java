package clean.code.design_patterns.requirements.Observer;

public class NewsletterTest {
    public static void main(String[] args) {
        OnlineStoreNewsletter onlineStore = new OnlineStoreNewsletter();
        Subscriber sub1 = new Subscriber("username1");
        Subscriber sub2 = new Subscriber("username2");
        Subscriber sub3 = new Subscriber("username3");

        onlineStore.register(sub1);
        onlineStore.register(sub2);
        onlineStore.notifyObservers("clothes sale");
        System.out.println();

       onlineStore.unregister(sub2);
       onlineStore.register(sub3);
       onlineStore.notifyObservers("shoes sale");

    }
}
