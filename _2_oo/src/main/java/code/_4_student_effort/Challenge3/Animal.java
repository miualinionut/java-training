package code._4_student_effort.Challenge3;

public abstract class Animal {
    protected int legs;

    protected Animal(int Legs){
        this.legs = Legs;
    }

    public abstract void eat();

    public void walk(){
        System.out.println("Animal is walking and has " + legs + " Legs.");
    }
}
