package code._4_student_effort.animal_hierarchy;

public class Fish extends Animal implements Pet{
   private String name;
    public Fish(){
        super(0);
    }
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }

    @Override
    void walk(){
        System.out.println("Fish can't walk");
    }

    @Override
    public void play(){
        System.out.println("Fish plays");
    }

    @Override
    public void eat(){
        System.out.println("Fish eats");
    }
}
