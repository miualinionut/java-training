package code._4_student_effort.AnimalHierarchy;

public class Fish extends Animal implements Pet {
    String name;

    Fish(){super(0);}

    @Override

    public String getName(){return this.name;}

    @Override

    public void setName(String name){this.name = name;}

    @Override

    public void play(){System.out.println("The fish is playing");}

    @Override

    public void walk(){System.out.println("The fish can't walk");}

    @Override

    public void eat(){System.out.println("The fish is eating");}
}
