package code._4_student_effort.Observer;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject {
    List<Observer> observers = new ArrayList<>();
    @Override
    public void register(Observer obj){
        observers.add(obj);
    }

    @Override
    public void unregister(Observer obj){
        int idx = observers.indexOf(obj);
        if(idx !=-1){
            observers.remove(idx);
        }
    }

    @Override
    public void notifyObservers(String message){
        for(Observer obj : observers){
            obj.update(message);
        }
    }

    public void teach(String topic){
        for(Observer obj : observers){
            obj.update(topic);
        }
    }
}
