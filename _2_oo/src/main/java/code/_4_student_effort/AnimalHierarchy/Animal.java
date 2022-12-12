package code._4_student_effort.AnimalHierarchy;

public abstract class Animal {
    int legs;
   protected Animal(int legs){
        this.legs = legs;
    }
        public abstract void walk();
    public abstract void eat();
}
