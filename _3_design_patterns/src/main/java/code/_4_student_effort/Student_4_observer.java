package code._4_student_effort;

public class Student_4_observer implements Observer{
    String _name;

    public String get_name() {
        return _name;
    }

    public Student_4_observer(String _name) {
        this._name = _name;
    }
    public void listenTo(Teacher teacher){
        teacher.register(this);
    }


    @Override
    public void update(String message) {
        System.out.println("Student "+_name+" learned about "+message);
    }
}
