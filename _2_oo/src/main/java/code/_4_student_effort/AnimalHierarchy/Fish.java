package code._4_student_effort.AnimalHierarchy;

public class Fish extends Animal implements Pet
{

    protected Fish()
    {
        super(0);
    }

    @Override
    public void eat()
    {
        System.out.println("The fish ate a lot of fish food.");
    }

    @Override
    public String getName()
    {
        return null;
    }

    @Override
    public void setName(String name){};

    @Override
    public void play()
    {
        System.out.println("The fish 'danced'!");
    }

    @Override
    public void walk()
    {
        System.out.println("Fish can't walk, they don't have legs.");
    }
}
