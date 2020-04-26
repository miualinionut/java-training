package code._4_student_effort.Animal_Hierarchy;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs)
    {
        this.legs = legs;
    }

    public abstract void eat();

    public void walk()
    {
        System.out.println("Animalul cu " + legs + " picioare merge.");
    }
}
