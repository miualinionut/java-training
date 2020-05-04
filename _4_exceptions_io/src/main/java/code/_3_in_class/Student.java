package code._3_in_class;

public class Student {

    private String nume;

    public Student(String nume) {
        this.nume = nume;
    }

    void sayHello () {
        System.out.println(nume + " says hello");
    }
}
