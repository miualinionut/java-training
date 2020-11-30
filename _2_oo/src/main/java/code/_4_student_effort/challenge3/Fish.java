package code._4_student_effort.challenge3;

public class Fish extends Animal{
    public Fish(int legs) {
        super(0);
    }

    @Override
    public void eat() {
    }

    @Override
    public void walk(){
        System.out.println("this animal with "+legs+" legs can't walk");
    }
}
