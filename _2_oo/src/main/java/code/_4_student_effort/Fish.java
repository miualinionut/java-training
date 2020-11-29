package code._4_student_effort;

public class Fish extends Animal implements  Pet{
    private String name;

    public Fish() {
        super(0);
    }

    @Override
    public void move() {
        System.out.println("fish cannot walk, it does not have legs");
    }

    public void eat(){
        System.out.println("the fish eats");
    }

    public void test(){
        super.move();
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void play(){
        System.out.println("you play with the fish.");
    }

}
