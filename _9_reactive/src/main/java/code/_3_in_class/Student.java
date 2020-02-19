package code._3_in_class;

public class Student implements Observer {
    private String nume;

    public Student(String nume) {
        this.nume = nume;
    }

    @Override
    public void update(String msg) {
        System.out.println( this.nume +" am fost notificat cu mesajul: " + msg);
    }

    public void subscribe(ObservedSubject netflix) {
        netflix.register(this);
    }
}
