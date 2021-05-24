package code._4_student_effort.Animal_Hierarchy;

public abstract class Animal {

    protected Integer legs;
    protected Animal(Integer numberOfLegs){

        this.legs = numberOfLegs;

    }
    public abstract void eat();

    public void walk(){
        System.out.println("This animal has " + legs + "to walk on");
    }




}
