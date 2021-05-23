package code._4_student_effort.AnimalHierarchy;

abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    abstract void eat();

    public void walk(){
        System.out.println("Animal with "+legs+" legs is walking");
    }
}
