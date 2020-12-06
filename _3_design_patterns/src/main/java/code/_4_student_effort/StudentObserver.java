package code._4_student_effort;

public class StudentObserver implements  Observer{
    private final String name;

    public  StudentObserver(String name){
        this.name = name;
    }

    public void update(String message){
        System.out.println("Student " + name + "learned about " + message);
    }
}
