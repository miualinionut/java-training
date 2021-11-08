package code._4_student_effort;

public class Cat extends Animal implements Pet{
    String name;
    Cat(String name){
        super(4);
        this.name = name;
    }
    Cat(){
        this("");
    }
    @Override
    void eat() {
        System.out.println("The cat ate a mice!");
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
        System.out.println("The cat plays with a wool ball!");
    }
}
