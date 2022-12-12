package code._4_student_effort.AnimalHierarchy;

public class Spider extends Animal{
    Spider(){
        super(8);
    }

    @Override
    public void walk() {
        System.out.println("Paianjanul merge");
    }

    @Override
    public void eat() {
        System.out.println("Paianjanul mananca");
    }
}
