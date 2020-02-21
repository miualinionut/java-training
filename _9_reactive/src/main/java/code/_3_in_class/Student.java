package code._3_in_class;

import java.sql.Struct;

public class Student implements Observer {

    private String nume;

    public Student(String nume){

        this.nume = nume;

    }

    @Override
    public void update(String msg) {
        System.out.println("am fost notificat cu mesajul " + msg);
    }
    public void subscribe(ObservedSubject netflix){
        netflix.register(this);
    }
}
