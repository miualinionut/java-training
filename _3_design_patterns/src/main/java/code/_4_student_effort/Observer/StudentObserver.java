package code._4_student_effort.Observer;


public class StudentObserver implements Observer{
    private final String Name;

    public StudentObserver(String Name){
        this.Name = Name;
    }

    public void listenTo(TeacherObserver teacher){

        teacher.register(this);
    }
    @Override
    public void update(String message) {
        System.out.println(Name + " learned about: " + message);
    }


}
