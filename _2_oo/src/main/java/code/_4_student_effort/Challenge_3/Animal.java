package code._4_student_effort.Challenge_3;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    protected Animal() {
        super();
    }

    public abstract void eat();

    public void walk() {
        System.out.println("The animal walks using " + legs +" legs");
    }
}
