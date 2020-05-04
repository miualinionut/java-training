package code._4_student_effort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Teacher implements ObservedSubject {
    private List<Observer> observers = new ArrayList<>();

    @Override
    public void register(Observer obj) {

        observers.add(obj);
    }


    @Override
    public void unregister(Observer obj) {

        observers.remove(obj);
    }


    @Override
    public void notifyObservers(String message) {


        observers.forEach((observer -> observer.update(message)));
    }

    public void teach(String capitol) {

        observers.forEach((observer -> observer.update(capitol)));
    }
}