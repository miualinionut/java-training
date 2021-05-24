package code._4_student_effort.Animal_Hierarchy;

public class Cat extends Animal implements Pet{

    private String name;

    public Cat(String name){
        super(4);
        this.name = name;
    }

    public Cat(){
        this("");

    }

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Cat" + this.name + "is playing");
    }

    @Override
    public void eat() {
        System.out.println("Cat" + this.name + "is eating");
    }


}
