package code._4_student_effort.Challange1;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack)
    {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
    public int getHealth()
    {
        return health;
    }
    public String getName()
    {
        return name;
    }
    public int getDamagePerAttack()
    {
        return damagePerAttack;
    }
    public void takeDamage(int damageTaken)
    {
        this.health -= damageTaken;
    }
    public void attack(Fighter opponent)
    {
        opponent.takeDamage(this.damagePerAttack);
    }

}
