package code._4_student_effort.Observer;



import java.util.ArrayList;
import java.util.Arrays;


public class Client {
    public static void main(String[] args) {
        TeacherObserver teacher = new TeacherObserver();

        StudentObserver s01 = new StudentObserver("Popescu");
        StudentObserver s02 = new StudentObserver("Ionescu");
        StudentObserver s03 = new StudentObserver("Dragomirescu");

        s01.listenTo(teacher);
        s02.listenTo(teacher);
        s03.listenTo(teacher);


        ArrayList<String> topics = new ArrayList<String>(Arrays.asList( "basics", "oo", "Design Patterns") );

        for(int i = 0; i < topics.size(); i++)
        {
            teacher.teach(topics.get(i));
        }
    }
}