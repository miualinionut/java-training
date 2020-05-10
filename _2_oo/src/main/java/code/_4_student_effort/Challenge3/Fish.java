package code._4_student_effort.Challenge3;

public class Fish extends Animal {

    public Fish() {
        super(0);
        System.out.println("Constructor: I don't have legs!");
    }

    @Override
    public void walk(){
        System.out.println("I can't walk!");
    }

    public void eat(){
        System.out.println("I eat fish food!");
    }
}
