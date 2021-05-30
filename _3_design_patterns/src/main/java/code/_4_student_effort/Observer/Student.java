package code._4_student_effort.Observer;

public class Student implements Observer{
    private String studentName;

    public Student(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public void update(String message) {

        System.out.println(" Student" + studentName+ " learned about" + message);
    }

    public void listenTo(Teacher teacher) {
        teacher.register(this);

    }

}
