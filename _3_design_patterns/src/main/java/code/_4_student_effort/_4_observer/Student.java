package code._4_student_effort._4_observer;

public class Student implements Observer{
    String name;

    public Student(String name) {
        this.name = name;
    }

    @Override
    public String update(String message) {
        return "Student " + name + " was notified: " + message + " ";
    }
}
