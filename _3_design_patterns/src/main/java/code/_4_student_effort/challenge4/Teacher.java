package code._4_student_effort.challenge4;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements ObservedSubject {

    List<Observer> listaStudenti = new ArrayList<Observer>();

    public void teach(String message){
        notifyObservers(message);
    }

    @Override
    public void register(Observer obj) {

        listaStudenti.add(obj);

    }

    @Override
    public void unregister(Observer obj) {

        listaStudenti.remove(obj);

    }

    @Override
    public void notifyObservers(String message) {
        for(int i=0; i<listaStudenti.size();i++){
            listaStudenti.get(i).update(message);
        }
    }
}
