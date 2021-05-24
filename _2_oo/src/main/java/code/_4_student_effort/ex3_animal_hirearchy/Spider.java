package code._4_student_effort.ex3_animal_hirearchy;

public class Spider extends Animal {
    public Spider() {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("the spider eats");
    }
}