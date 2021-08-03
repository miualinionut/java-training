package code._4_student_effort;

public abstract class Animal {
    protected int legs;
    protected Animal(int legs){
        legs=legs;
    }
    public abstract void eat();
    public void walk(){
        System.out.println("Animal that has "+legs+" legs is walking");
    }
}
