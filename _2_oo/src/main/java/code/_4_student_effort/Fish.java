package code._4_student_effort;

public class Fish extends Animal{

    protected Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("The fish eats fish food");
    }
    public void walk(){
        System.out.println("The fish can't walk");
    }
}
