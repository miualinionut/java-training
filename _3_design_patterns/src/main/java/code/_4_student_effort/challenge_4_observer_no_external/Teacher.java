package code._4_student_effort.challenge_4_observer_no_external;

import java.util.ArrayList;

public class Teacher implements ObservedSubject{
    String topic;
    ArrayList<Observer> students;

    public Teacher(){
        students = new ArrayList<>();
        topic = "";
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
    public void notifyObserver(String message) {
        this.topic = message;
        for(Observer student : students){
            student.update(this.topic);
        }
    }

    void teach(String topic){ notifyObserver(topic);}
}
