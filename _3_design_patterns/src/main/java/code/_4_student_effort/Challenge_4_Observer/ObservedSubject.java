package code._4_student_effort.Challenge_4_Observer;

public interface ObservedSubject {
    void register(Observer obj);

    void unregister(Observer obj);

    void notifyObservers(String message);
}
