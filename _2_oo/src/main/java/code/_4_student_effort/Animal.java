package code._4_student_effort;

abstract class Animal {
   protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }

    public void walk(){
        System.out.println("Animal is walking on: "+legs+" legs");
    }
    public void eat(){}


}
