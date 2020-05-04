package code._4_student_effort.Observer;

public interface ObservedSubject {
    void register(Observer obj);
    void unregistred(Observer obj);
    void notifyObservers(String message);
}
