package code._4_student_effort.Challenge4;

import java.util.Arrays;

public class Teacher implements ObservedSubject{
    String subject;
    Observer[] observers = new Observer[0];
    public void teach(String subject) {
        for(int i = 0; i < observers.length; i++) {
            observers[i].update(subject);
        }
    }


    public void register(Observer obj) {
        observers = Arrays.copyOf(observers, observers.length + 1);
        observers[observers.length - 1] = obj;
    }

    public void unregister(Observer obj) {
        int unreg_i = -1;
        for(int i = 0; i < observers.length; i++)
            if(observers[i].equals(obj)) {
                unreg_i = i;
                break;
            }
        System.arraycopy(observers, unreg_i + 1, observers, unreg_i, observers.length - 1 - unreg_i);
    }

    public void notifyObservers(String message) {
        System.out.println(message);
    }
}
