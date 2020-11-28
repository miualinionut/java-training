package code._4_student_effort.Challenge3;

public class Fish extends Animal implements Pet {
    public String name;
    public Fish(String Name){
        super(0);
        this.name = Name;
    }

    @Override
    public void eat() {
        System.out.println("Fish: " + this.name + " Is eating ");
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk, only can swim!");
    }
//Pet
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
        System.out.println(name + " plays in water!");
    }
}
