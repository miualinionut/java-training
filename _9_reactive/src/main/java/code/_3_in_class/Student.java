package code._3_in_class;

public class Student implements Observer {
    private String name;

    public Student(String nume) {
        this.name = nume;
    }

    @Override
    public void update(String msg) {
        System.out.println(this.name + ": am primit mesajul: " + msg);
    }

    public void subscribe(ObservedSubject netflix) {
        netflix.register(this);

    }
}
