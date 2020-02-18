package code._3_in_class;

public class Student implements Observer {

    private String nume;

    public Student(String nume){
        this.nume = nume;
    }
    @Override
    public void update(String msg) {
        System.out.println("Am fost notificat cu mesajul:" + msg);
    }

    public void subscriber(ObserverSubject netflix){
        netflix.register(this);
    }
}
