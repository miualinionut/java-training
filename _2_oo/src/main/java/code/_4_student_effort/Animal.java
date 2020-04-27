package code._4_student_effort;

public abstract class Animal {
    protected int legs;
    protected Animal(int l){legs=l;}
    public void walk(){
        System.out.println("I walk with " + legs + " legs");
    }
    public abstract void eat();
}
