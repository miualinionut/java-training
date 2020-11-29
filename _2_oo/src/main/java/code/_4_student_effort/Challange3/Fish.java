package code._4_student_effort.Challange3;
public class Fish extends Animal implements Pet{
    private String name;
    public Fish(String _name)
    {
        super(0);
        name = _name;
    }
    public Fish()
    {
        this("");
    }
    @Override
    public void walk() {
        System.out.println("Pestii nu pot merge ca nu au picioare");
    }

    public void eat(Integer amount)
    {
        belly += 3 * amount;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String newName)
    {
        name = newName;
    }
    public void play()
    {
        System.out.println(name + " se invarte prin acvariu");
    }
}
