package code._4_student_effort.tema3.Observer;
import java.util.ArrayList;
import java.util.List;

public class Student implements Observer{

    private String nume;
    private List<String> learnedTopics = new ArrayList<>();

    public Student(String nume){
        this.nume = nume;
    }

    public void listenTo(Teacher teacher) {
        teacher.register(this);
    }

    @Override
    public void update(String message) {
        learnedTopics.add(message);
        System.out.println("Student " + this.nume + " learned about " + message);
    }

    public void printMaterii (){
        for(String s: learnedTopics){
            System.out.println(s);
        }
    }
}
