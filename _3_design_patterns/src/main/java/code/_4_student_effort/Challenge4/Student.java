package code._4_student_effort.Challenge4;

public class Student implements Observer{
    String name;
    Teacher teacher;

    public Student(String name) {
        this.name = name;
    }

    public void listenTo(Teacher teacher) {
        teacher.register(this);
    }

    public void update(String message) {
        System.out.println("Student " + name + " has learned " + message);
    }

}
