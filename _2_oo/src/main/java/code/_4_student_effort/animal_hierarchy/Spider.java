package code._4_student_effort.animal_hierarchy;

public class Spider extends Animal{
    @Override
    void eat() {
        System.out.println("I eat bugs");
    }
    public Spider(){
        super(8);
    }
}
