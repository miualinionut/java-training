package code._4_student_effort;

public class Cat extends Animal implements Pet{

    private String name;

    public Cat(String name) {
        super(4);
        this.name=name;
    }

    public Cat(){
        this("");
    }

    @Override
    public void eat() {

        System.out.println("The cat eats cat food");
    }

    @Override
    public void play() {

        System.out.println("The cat plays with a toy mouse");

    }
    @Override
    public void setName(String name) {
         this.name=name;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
