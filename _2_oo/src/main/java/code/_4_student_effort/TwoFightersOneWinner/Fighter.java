package code._4_student_effort.TwoFightersOneWinner;

public class Fighter
{
    private String name;
    private int health, damage;

    public Fighter(String name, int health, int damage)
    {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public int getHealth()
    {
        return health;
    }

    public String getName()
    {
        return name;
    }

    public void attack (Fighter opponent)
    {
        opponent.health = opponent.health - damage;
    }
}
