package code._4_student_effort._4_observer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teacher implements ObservedSubject{
    List<Observer> students = new ArrayList<>();

    @Override
    public void register(Observer... objects) {
        Collections.addAll(students, objects);
    }

    @Override
    public void unregister(Observer... objects) {
        for(Observer object:objects)
            students.remove(object);
    }

    @Override
    public String notifyObservers(String message) {
        StringBuilder feedback = new StringBuilder();
        for(Observer student: students)
            feedback.append(student.update(message));
    return feedback.toString();
    }
}
