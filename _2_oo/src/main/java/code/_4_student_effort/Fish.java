package code._4_student_effort;

public class Fish extends Animal implements Pet{
    private String name;

    public Fish(){
        super(0);
    }

    @Override
    public void eat() {
        System.out.print("This fish eats smaller fishes.");
    }

    @Override
    public void walk() {
        System.out.print("The fish can't walk.");
    }

    @Override
    public void play() {
        System.out.println("This fish doesn't feel like playing.");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
