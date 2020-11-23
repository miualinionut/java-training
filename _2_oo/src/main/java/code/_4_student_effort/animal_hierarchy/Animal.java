package code._4_student_effort.animal_hierarchy;

public abstract class Animal {
    protected int legs;
    protected Animal(int legs){
        this.legs=legs;
    }
    abstract void eat();
    void walk (){
        System.out.println("This animal has "+legs+ " legs and can walk");
    }
}
