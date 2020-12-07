package code._4_student_effort.Observer;

import java.util.Arrays;

public class Teacher implements ObservedSubject {
    Observer[] students = new Observer[0];
    int numberOfStudents = 0;
    @Override
    public void register(Observer obj) {
        students = Arrays.copyOf(students, numberOfStudents+1 );
        students[numberOfStudents++] = obj;
    }

    @Override
    public void unregister(Observer obj) {
        int index=0;
        for (Observer observer: students) {
            if (observer.equals(obj))
                System.arraycopy(students, index+1, students, index, numberOfStudents-index-1);
            index++;
        }
    }

    @Override
    public void notifyObservers(String message) {
        for (Observer student: students) {
            student.update(message);
        }
    }
    public void teach(String subject){
        notifyObservers(subject);
    }
}
