package code._4_student_effort.challenge3;

public abstract class Animal {
    protected int legs;
    protected Animal(int l){
        legs=l;
    }
    abstract void eat();
    void walks(){
        System.out.println("Animal walks using "+legs+" legs");
    }
}
