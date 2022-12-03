package code._4_student_effort.challenge_3;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk() {
        System.out.println("The animal is walking using " + legs + " legs");
    }
}
