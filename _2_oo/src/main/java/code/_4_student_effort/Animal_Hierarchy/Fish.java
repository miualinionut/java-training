package code._4_student_effort.Animal_Hierarchy;

public class Fish extends Animal implements Pet{
    public String name;

    public Fish(){
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Fish" + this.name + "is eating");
    }

    @Override
    public void walk() {
        System.out.println("Fishes can't walk");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Fish" + this.name + "is playing");
    }
}
