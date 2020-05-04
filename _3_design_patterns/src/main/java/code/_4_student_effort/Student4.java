package code._4_student_effort;

public class Student4 implements Observer {
    private String name;


    public Student4(String name) {
        this.name = name;
    }

    public void listenTo(Teacher teacher) {
        teacher.register(this);
    }

    @Override
    public void update(String message) {

        System.out.println("Student " + name + " learned about " + message);
    }
}
