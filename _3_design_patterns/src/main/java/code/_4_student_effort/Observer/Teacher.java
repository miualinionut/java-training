package code._4_student_effort.Observer;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject{
    private List<Observer> studenti = new ArrayList<>();

    @Override
    public void register(Observer obj) {
        studenti.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        studenti.remove(obj);
    }

    @Override
    public void notifyObservers(String msg) {
        for(Observer student : studenti){
            student.update(msg);
        }
    }

    public void teach(String javaTopic) {
        notifyObservers(javaTopic);
    }
}
