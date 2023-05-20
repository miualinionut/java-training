package code._3_in_class;

import java.util.Random;

public class Boxor implements IBoxer{

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
    public void attack(IBoxer opponent)
    {
        int defendValue = (this.damagePerAttack * this.defend()) / 100;
        opponent.receiveAttack(this.damagePerAttack - defendValue);
    }
    public int defend()
    {
        Random random = new Random();
        int defendPercentage = random.nextInt(101);

        return defendPercentage;
    }

    public boolean isAlive()
    {
        return this.health > 0;
    }

    @Override
    public void receiveAttack(int damage) {

        this.health = this.health - damage;
        System.out.println("defendValue: " + damage);
        System.out.println("newHealth: " + this.health);
    }
}
