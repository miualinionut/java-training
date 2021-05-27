package code._4_student_effort._4_observer;

public interface ObservedSubject {

    void register(Observer... objects);

    void unregister(Observer... objects);

    String notifyObservers(String message);

}
