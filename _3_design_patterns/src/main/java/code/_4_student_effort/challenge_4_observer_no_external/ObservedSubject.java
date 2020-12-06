package code._4_student_effort.challenge_4_observer_no_external;

public interface ObservedSubject {
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObserver(String message);
}
