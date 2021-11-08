package code._4_student_effort;

abstract public class Animal {
    protected int legs;
    Animal(int legs){
        this.legs = legs;
    }
    abstract void eat();
    void walk(){
        System.out.println("This animal walks on "+legs+" legs!");
    }
}
