package code._4_student_effort;

public class Fish extends Animal implements Pet{
    String name;
    Fish(String name){
        super(0);
        this.name = name;
    }
    Fish(){
        this("");
    }
    @Override
    void walk(){
        System.out.println("The fish can't walk because he has "+ this.legs + " legs!");
    }

    @Override
    void eat() {
        System.out.println("The fish ate sea food!");
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
        System.out.println("The fish plays in the water!");
    }
}
