package code._4_student_effort;

public class Fish extends Animal implements Pet{
    private String name;
    public Fish(){
        super(0);
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void eat() {
        System.out.println("The fish rushes to their food");
    }

    @Override
    public void play() {
        System.out.println("They don't seem to eager to do anything...");
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk, dummy!");
    }
}
