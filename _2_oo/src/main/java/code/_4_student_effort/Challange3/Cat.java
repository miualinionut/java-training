package code._4_student_effort.Challange3;

public class Cat extends Animal implements Pet{
    private String name;
    public Cat(String _name)
    {
        super(4);
        name = _name;
    }
    public Cat()
    {
        this("");
    }
    public void eat(Integer amount)
    {
        belly += 2 * amount;
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
        System.out.println(name + " se joaca cu ghemul");
    }
}
