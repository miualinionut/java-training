package code._4_student_effort;

abstract class Animal {
    protected Integer legs;

    protected Animal(Integer legs) {
        this.legs = legs;
    }

    abstract void eat();

    public void move(){
        System.out.println("The animal moves by using its " + legs + " legs");
    }

}
