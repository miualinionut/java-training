package code._4_student_effort.Challenge_3;

public class Fish extends Animal implements Pet {
    private String name;

    public Fish() {
        super(0);
    }

    public void eat() {
        System.out.println("The fish is eating");
    }

    public void walk() {
        System.out.println("A fish can't walk");
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play() {
        System.out.println("The fish is playing");
    }
}
