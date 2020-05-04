package code._4_student_effort.challenge3;

public class Cat extends Animal implements Pet {

    String name;
    public Cat(){

        this("");

    }

    @Override
    void eat() {
        System.out.println("Pisicilor le place mancare umeda.");

    }

    ;

    public Cat(String name){
        super(4);
        this.name = name;


    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
            this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Pisicilor le place sa se joace cu soriceii");

    }
}
