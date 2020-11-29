package code._4_student_effort.Challange3;

public abstract class Animal {
    protected Integer legs;
    protected Integer belly; //used for eating
    protected Animal(int _legs)
    {
        legs = _legs;
        belly = 0;
    }

    abstract void eat(Integer amount);
    public void walk(){
        System.out.println("Animalul merge cu " + legs + " picioare");
    }
    public Integer getBelly()
    {
        return belly;
    }

}
