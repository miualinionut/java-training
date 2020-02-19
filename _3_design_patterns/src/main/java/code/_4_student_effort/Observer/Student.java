package code._4_student_effort.Observer;

public class Student implements Observer {
    private String nume;

    public Student(String nume) {
        this.nume = nume;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public void update(String msg) {
        System.out.println(msg + " - " + this.getNume());
    }

    public void listenTo(Teacher teacher){
        teacher.register(this);
    }
}
