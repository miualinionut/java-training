package code._4_student_effort;

public abstract class Animal {
    protected int legs;
    protected Animal (int legs) {
        this.legs = legs;
    }

    protected void walk() {
        System.out.println("Animal walks with " + legs + " legs.");
    }
    abstract void eat();

    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat ("Fluffy");
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        d.walk();
        d.play();
        System.out.println("");

        c.eat();
        c.walk();
        c.play();
        System.out.println("");

        a.eat();
        a.walk();
        // a.play(); error
        System.out.println("");

        e.walk();
        e.eat();
        // e.play(); error
        System.out.println("");

        // p.eat(); error
        // p.walk(); error
        p.play();
    }
}
