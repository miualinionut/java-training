package code._4_student_effort;

import java.util.Arrays;

public class TeacherObserved implements  ObservedSubject{
    private Observer[] observers = new Observer[0];

    public void teach(String topic){
        for (int i=0; i<this.observers.length; i++) {
            this.observers[i].update(topic);
        }
    }

    @Override
    public void register(Observer obj) {
        this.observers = Arrays.copyOf(this.observers,this.observers.length + 1);
        this.observers[this.observers.length-1] = obj;
    }

    @Override
    public void unregister(Observer obj) {
        int index = 0;
        for(int i=0; i<observers.length; i++){
            if(this.observers[i].equals(obj)){
                index = i;
                break;
            }
        }
        System.arraycopy(this.observers, index+1, this.observers, index, this.observers.length - index - 1);
    }

    @Override
    public void notifyObservers(String message) {
        for (int i=0; i<this.observers.length; i++) {
            this.observers[i].update(message);
        }
    }
}
