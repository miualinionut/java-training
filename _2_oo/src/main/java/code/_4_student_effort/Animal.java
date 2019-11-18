package code._4_student_effort;

public abstract class Animal {

    protected int legs; //protected integer

    protected Animal(int legs){ //protected constructor
        this.legs = legs;
    }

    public abstract void eat(); //abstract method eat

    public void walk(){ //concrete method

        System.out.println("Toate animalele merg cu toate cele " + legs +" picioare.");
    }
}
