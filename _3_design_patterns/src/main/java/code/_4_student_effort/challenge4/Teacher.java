package code._4_student_effort.challenge4;
import java.util.ArrayList;

public class Teacher implements ObservedSubject{
    ArrayList<Observer> observers=new ArrayList<Observer>();

    @Override
    public void register(Observer obj) {
        observers.add(obj);
    }

    @Override
    public void unregister(Observer obj) {
        for(int i=0;i<observers.size();i++){
            if(observers.get(i).equals(obj)){
                observers.remove(i);
            }
        }

    }

    @Override
    public void notifyObserver(String message) {
        for(int i=0;i<observers.size();i++){
            observers.get(i).update(message);
        }
    }

    public void teach(String topic) {
        for(int i=0;i<observers.size();i++){
            observers.get(i).update(topic);
        }
    }
}
