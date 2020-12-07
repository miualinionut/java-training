package code._4_student_effort;

public abstract class Animal {
    protected Integer legs; //number of legs for this animal

    public Animal(Integer legs) {
        this.legs = legs;
    }

    public abstract void eat();


    public void walk(){
        System.out.println("This creature walks, using his " + this.legs + " legs.");
    }
}
