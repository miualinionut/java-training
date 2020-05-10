package code._2_challenge._6_reactive_producers;

public class Student<T> implements Observer<T> {
    private final String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public void receiveNotification(T message) {
        String text = Thread.currentThread().getName() + " - " + this.name + " received: " + message;
        System.out.println(text);
    }
}
