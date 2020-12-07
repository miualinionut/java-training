package code._4_student_effort;

public class Fish extends Animal {

    protected Fish() {
        super(0);
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk, because it doesn't have legs.");
    }

    @Override
    public void eat() {
        System.out.println("Fish ate and he said: 'Thank you for feeding me, master.'");
    }
}
