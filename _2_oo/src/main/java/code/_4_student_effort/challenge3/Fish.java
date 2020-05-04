package code._4_student_effort.challenge3;

public class Fish extends Animal implements Pet {

    String nume;


    public Fish(){
        super(0);
    };

    @Override
    void walk() {
        System.out.println("Pestii nu pot merge, pentru ca nu au picioare");
    }


    @Override
    void eat() {
        System.out.println("Pestilor le place sa manance mult!");
    }

    @Override
    public String getName() {
        return this.nume;
    }

    @Override
    public void setName(String name) {
        this.nume = name;
    }

    @Override
    public void play() {
        System.out.println("Pestilor nu le place sa stea pe loc!");

    }
}
