package code._4_student_effort.challenge3;

public abstract class Animal {
    public int legs;

    public Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk(){
        System.out.println("this animal with"+legs+"can walk");
    }
}
