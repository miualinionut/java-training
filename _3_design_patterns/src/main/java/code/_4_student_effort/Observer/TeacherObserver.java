package code._4_student_effort.Observer;

import java.util.ArrayList;
import java.util.Iterator;

public class TeacherObserver implements ObserverSubject{
     ArrayList<Observer> observerList;

     public TeacherObserver(){
         observerList = new ArrayList<Observer>();
     }

    @Override
    public void register(Observer obj) {
        observerList.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        observerList.remove(observerList.indexOf(obj));
    }

    @Override
    public void notifyObservers(String message) {
         //iterator observer it, get the iterator call has next, exit the loop when we don't have any more
        //get the next one
        //call update
         for(Iterator<Observer> it = observerList.iterator(); it.hasNext();){
             Observer o = it.next();
             o.update(message);
         }
    }
    public void teach(String topic) {
        //iterator observer it, get the iterator call has next, exit the loop when we don't have any more
        //get the next one
        //call update
        for (Iterator<Observer> it = observerList.iterator(); it.hasNext(); ) {
            Observer o = it.next();
            o.update(topic);
        }
    }
}
