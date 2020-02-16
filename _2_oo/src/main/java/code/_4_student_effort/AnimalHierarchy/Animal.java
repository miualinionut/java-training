package code._4_student_effort.AnimalHierarchy;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public abstract void eat();
    public void walk(){
        System.out.println("walking with " + getLegs());
    }
}
