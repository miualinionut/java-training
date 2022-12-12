package code._4_student_effort.AnimalHierarchy;

public class Cat extends Animal implements Pet{
    String name;

    Cat(String name){
        super(4);
        this.name = name;
    }
    Cat(){
        super(4);
        new Cat(" ");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("pisica se joaca");
    }

    @Override
    public void eat() {
        System.out.println("pisica mananca");
    }

    @Override
    public void walk() {
        System.out.println("pisica se plimba");
    }

}
