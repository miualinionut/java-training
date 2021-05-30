package code._4_student_effort.challenge4;



public class Student implements Observer{
    String name;
    Student(String n){
        name=n;
    }

    @Override
    public void update(String message) {
            System.out.println("Student " + name + " learned about " + message);

    }
    public void learnFrom(Teacher teacher) {

        teacher.register(this);

    }
}
