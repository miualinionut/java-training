package code._4_student_effort.observer;

import java.util.ArrayList;

public class Teacher implements ObservedSubject{
    ArrayList<Observer> students;

    public Teacher() {
        students = new ArrayList<>();
    }

    @Override
    public void register(Observer obj) {
        students.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        students.remove(obj);
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer obs : students) {
            obs.update(message);
        }
    }

    public void teach(String message) {
        notifyObservers(message);
    }
}
