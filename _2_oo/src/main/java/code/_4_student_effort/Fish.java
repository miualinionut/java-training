package code._4_student_effort;

public class Fish extends Animal implements Pet {

    private String name;

    protected Fish() {
        super(0);
        System.out.println("A fish doesn't have legs");
    }

    @Override
    public void eat() {
        System.out.println("blob blub");
    }

    public void eat(String sound){
        System.out.println("Fish makes eat sounds:" + sound);
    }

    @Override
    public void walk() {
        System.out.println("IT CANNOT WALK");
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public void play() {
        System.out.println("Fish is playing");
    }
}
