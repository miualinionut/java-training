package code._4_student_effort.animal_hierarchy;

public abstract class Animal {
    protected Integer legs;

    protected Animal(Integer legs) {
        this.legs = legs;
    }

    abstract void eat();

    protected void walk () {
        System.out.println("Animal walks on its: " + legs + " legs!");
    }
}
