package code._4_student_effort.AnimalHierarchy;

public abstract class Animal {
    protected int legs;

    public Animal(int legs) {
        this.legs = legs;
    }
    public abstract void eat();
    public void walk(){
        System.out.println("The animal walks on " + legs + " legs" );
    }
}
