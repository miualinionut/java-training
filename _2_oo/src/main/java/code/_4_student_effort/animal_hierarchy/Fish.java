package code._4_student_effort.animal_hierarchy;

public class Fish extends Animal implements Pet{
    private String name;



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
        System.out.println("The fish is playing");
    }

}
