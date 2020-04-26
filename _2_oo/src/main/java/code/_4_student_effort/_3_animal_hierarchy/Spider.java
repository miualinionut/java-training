package code._4_student_effort._3_animal_hierarchy;

public class Spider extends Animal {
    public Spider(){
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("The spider is eating!");
    }
}
