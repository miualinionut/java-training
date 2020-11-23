package code._4_student_effort.animal_hierarchy;

public class Cat extends Animal implements Pet {
    String name;
    public Cat(String name){
        super(4);
        this.name=name;
    }
    public Cat(){
        this("");
    }

    @Override
    void eat() {
        System.out.println("I eat cat food");
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
        System.out.println("Im playing with a mouse");
    }
}
