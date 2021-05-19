package code._4_student_effort.CodeChallenge3;

public class Fish extends Animal implements Pet{
    private String name;

    protected Fish() {
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Fish eats!");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Fish plays!");
    }

    @Override
    public void walk(){
        System.out.println("Fish can't walk!");
    }
}
