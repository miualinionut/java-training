package code._4_student_effort.Observer;

public class Student implements Observer {
    String name;
    ObservedSubject teacher;
    public void listenTo(ObservedSubject teacher){
        this.teacher=teacher;
        teacher.register(this);
    }
    public void stopListeningTo(ObservedSubject teacher){
        this.teacher=null;
    }
    public Student(String name){
        this.name=name;
    }
    @Override
    public void update(String message) {
        System.out.println("Student "+ this.name + " learned abput "+ message);
    }
}
