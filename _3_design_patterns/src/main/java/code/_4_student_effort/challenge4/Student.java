package code._4_student_effort.challenge4;

public class Student implements Observer {

    String name;
    Student(){};
    Student(String name){
        this.name = name;
    }

    @Override
    public void update(String message) {

        System.out.println("Student " + name + " learned about " + message);

    }
}
