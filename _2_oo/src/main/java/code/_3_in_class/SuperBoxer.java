package code._3_in_class;

public class SuperBoxer implements  IBoxer{

    String name;
    int health;
    int damagePerAttack;
    public SuperBoxer(String name, int health, int damagePerAttack)
    {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public SuperBoxer(String nume)
    {
        this.name = nume;
    }

    @Override
    public void attack(IBoxer opponent) {

    }

    @Override
    public int defend() {
        return 0;
    }

    @Override
    public boolean isAlive() {
        return this.health > 0;
    }

    @Override
    public void receiveAttack(int damage) {

    }
}
