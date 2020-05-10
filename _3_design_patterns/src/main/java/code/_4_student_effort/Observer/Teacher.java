package code._4_student_effort.Observer;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject {

    private String[] topicsToTeach;
    private int nrOfTopics;
    private List<Observer> observatori = new ArrayList<>();

    public Teacher(){
        nrOfTopics = 0;
    }

    @Override
    public void register(Observer obj) {
        observatori.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observatori.remove(obj);
    }

    @Override
    public void notifyObservers(String message) {
        for(Observer ob : observatori){
            ob.update(message);
        }
    }

    public void teach(String message) {
        notifyObservers(message);
    }
}
