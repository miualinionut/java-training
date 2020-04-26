package code._4_student_effort.tema2.Challenge3;

public abstract class Animal {

    protected int legs;

    protected Animal(int legs){

        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    abstract void eat();

    void walk() {
        System.out.println("This animal walks with "+ getLegs()+ " legs!");
    }

}
