package code._4_student_effort.Challenge4;

import code._4_student_effort.Challenge4.Observer;

public interface ObservedSubject {

    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers(String message);
}
