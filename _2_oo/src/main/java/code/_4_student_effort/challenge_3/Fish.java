package code._4_student_effort.challenge_3;

public class Fish extends Animal implements Pet {
    Fish() {
        super(0);
    }

    public void eat() {
        System.out.println("The fish is eating");
    }

    public String getName() {
        return null;
    }

    public void setName(String name) {}

    public void play() {
        System.out.println("The fish is playing");
    }

    public void walk() {
        System.out.println("The fish can't walk");
    }
}
