package code._3_in_class;

import java.util.Random;

public class BoxingFighter {
    private String name;
    private int health;
    private int minDamage;
    private int maxDamage;

    public BoxingFighter(String name, int health, int minDamage, int maxDamage) {
        this.name = name;
        this.health = health;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public void attack(BoxingFighter opponent) {
        int damage = new Random().nextInt(maxDamage - minDamage + 1) + minDamage;
        System.out.println(this.name + " attacks " + opponent.getName() + " and deals " + damage + " damage.");
        opponent.receiveDamage(damage);
    }

    public void receiveDamage(int damage) {
        this.health -= damage;
        System.out.println(this.name + " receives " + damage + " damage.");
        if (this.health <= 0) {
            System.out.println(this.name + " has been knocked out!");
        }
    }

    public void defend() {
        System.out.println(this.name + " defends the opponent's attack.");
    }

    public String getName() {
        return this.name;
    }

    public int getHealth() {
        return this.health;
    }

    public int getMinDamage() {
        return this.minDamage;
    }

    public int getMaxDamage() {
        return this.maxDamage;
    }
}
