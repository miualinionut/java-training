package code._3_in_class;

public class Boxor {

    String name;
    int health;
    int damagePerAttack;

    public Boxor(String name, int health, int damagePerAttack)
    {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public Boxor(String nume)
    {
        this.name = nume;
    }
    void attack(Boxor opponent)
    {
        opponent.health = opponent.health - this.damagePerAttack;
    }
    void defend()
    {

    }
}
