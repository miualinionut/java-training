package code._4_student_effort.challenge_4_observer_no_external;

public class Student implements Observer {

    String name;
    String learned;

    public Student(String name) {
        this.name = name;
        learned = "";
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
