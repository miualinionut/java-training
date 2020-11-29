package code._4_student_effort.AnimalHierarchy;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs){
        this.legs = legs;
    }

    public void walk(){System.out.println("Animal with" + " " + legs + " " + "legs started walking" );}

    public abstract void eat();
}
