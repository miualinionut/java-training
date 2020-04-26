package code._4_student_effort._3_animal_hierarchy;

public class Fish extends Animal {
    public Fish(){
        super(0);
    }

    @Override
    public void walk() {
        System.out.println("The fish can't walk because it has no legs!");
    }

    @Override
    public void eat() {
        System.out.println("The fish is eating!");
    }
}
