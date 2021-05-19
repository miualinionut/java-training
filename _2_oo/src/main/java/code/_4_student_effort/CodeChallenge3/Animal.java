package code._4_student_effort.CodeChallenge3;

public abstract class Animal {
    protected Integer legs;

    protected Animal(Integer legs){
        this.legs = legs;
    }

    public abstract void eat();

    public void walk(){
        System.out.println("Animal walks on " + legs + " legs");
    }
}
