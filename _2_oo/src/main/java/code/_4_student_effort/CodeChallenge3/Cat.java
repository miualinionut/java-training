package code._4_student_effort.CodeChallenge3;

public class Cat extends Animal implements Pet{
    private String name;

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    public Cat(){
        this("");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats!");
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
        System.out.println("Cat plays!");
    }
}
