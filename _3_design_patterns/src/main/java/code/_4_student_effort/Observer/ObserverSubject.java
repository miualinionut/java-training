package code._4_student_effort.Observer;
//Step 1 - Creating Subject interface / class
// Teacher communicate with students
public interface ObserverSubject {
    void register(Observer obj);
    void unregister(Observer obj);
    void notifyObservers(String message);
}
