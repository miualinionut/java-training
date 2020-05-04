package code._4_student_effort.challenge4;


public class Student implements Observer {

    String name;

    public Student(String name) {
        this.name = name;
    }


    public void listenTo(Teacher teacher){
        teacher.register(this);
    }

    @Override
    public void update(String message) {
        System.out.println(name +" learned about "+ message);
    }


}
