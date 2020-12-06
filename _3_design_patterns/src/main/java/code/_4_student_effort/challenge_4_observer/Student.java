package code._4_student_effort.challenge_4_observer;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class Student implements Observer, PropertyChangeListener {
    String name;
    String learned;

    public Student(String name) {
        this.name = name;
        learned = "";
    }

    public void propertyChange(PropertyChangeEvent event){
        update(event.getNewValue().toString());
    }

    @Override
    public void update(String message) {
        learned = message;
        System.out.println(name + " learned about " + learned);
    }

    void listenTo(Teacher teacher)
    {
        teacher.register(this);
    }
}
