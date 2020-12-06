package code._4_student_effort.Observer;

import code._2_challenge._4_observer.Teacher;

public class StudentObserver implements Observer{
    private final String Name;

    public StudentObserver(String Name){
        this.Name = Name;
    }

    public void listenTo(Teacher teacher){
        teacher.register(this::update);
    }
    @Override
    public void update(String message) {
        System.out.println(Name + " learned about: " + message);
    }


}
