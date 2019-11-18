package code._4_student_effort._animal_hierarchy;

public abstract class Animal {
    protected Integer legs;

    protected Animal(Integer legs)
    {
        this.legs=legs;
    }

    public void setLegs(Integer legs) {
        this.legs = legs;
    }
    public abstract void eat();
    public void walking()
    {
        System.out.println("Animalul cu " + legs "picioare merge");
    }
}
g