package code._2_challenge._6_netflix_observer;

import java.util.ArrayList;
import java.util.List;

public class NetflixObserverChallenge {
    public static void main(String[] args) {
        Netflix netflix = new Netflix();

        Student s01 = new Student("popescu");
        Student s02 = new Student("ionescu");
        Student s03 = new Student("dragomirescu");

        s01.subscribe(netflix);
        s02.subscribe(netflix);
        s03.subscribe(netflix);

        netflix.notifyObservers("a aparut ghemotron");
        netflix.notifyObservers("a aparut cel mai nou film!!!");

        netflix.unregister(s03);
        netflix.notifyObservers("episod nou");
    }
}

interface Observer {
    void update(String msg);
}

interface ObservedSubject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers(String msg);
}

class Netflix implements ObservedSubject {
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
        for(Observer subscriber: subscribers) {
            subscriber.update(msg);
        }
    }
}

class Student implements Observer {
    private String nume;

    public Student(String nume) {
        this.nume = nume;
    }

    @Override
    public void update(String msg) {
        System.out.println(this.nume + ": am fost notificat cu mesajul: " + msg);
    }

    public void subscribe(ObservedSubject netflix) {
        netflix.register(this);
    }
}

