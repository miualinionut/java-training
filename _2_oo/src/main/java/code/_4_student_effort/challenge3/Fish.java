package code._4_student_effort.challenge3;

public class Fish extends Animal implements Pet{
    String name;

    public Fish(){
        super(0);
    }
    public void walks(){
        System.out.println("Fish can't walk");
    }
    void eat() {
        System.out.println("Fish eat");
    }


    public String getName() {
        return name;
    }


    public void setName(String n) {
        name = n;
    }


    public void play() {
        System.out.println("Fish play");
    }
}
