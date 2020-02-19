package code._3_in_class;

public class MainNetflix {
    public static void main(String[] args) {
        Netflix subscriptionService = new Netflix();

        Student s01 = new Student("Gigel");
        Student s02 = new Student("Marrean");
        Student s03 = new Student("Florica");

        subscriptionService.register(s01);
        s02.subscribe(subscriptionService);
        s03.subscribe(subscriptionService);

        subscriptionService.notifyObservers("a aparut ghemotron");
        subscriptionService.notifyObservers("noul sezon din GOAT");


        subscriptionService.unregister(s03);

        subscriptionService.notifyObservers("nu mai apare noul sezon din GOAT");
    }
}
