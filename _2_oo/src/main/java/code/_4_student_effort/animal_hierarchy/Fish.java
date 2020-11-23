package code._4_student_effort.animal_hierarchy;

public class Fish extends Animal implements Pet {
    String name;
    public Fish(){
        super(0);
    };

    @Override
    void eat() {
        System.out.println("I eat fish food");
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
        System.out.println("i dont want to play");
    }

    @Override
    public void walk() {
        System.out.println("fish cant walk and dont have legs");
    }
}
