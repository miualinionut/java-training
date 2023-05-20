package code._3_in_class;

public class SuperBoxer implements IBoxer{
    String nume;
    int health=100;
    int damagePerAttack=10;
    public SuperBoxer(String nume, int health, int damagePerAttack) {
        this.nume = nume;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public SuperBoxer(String nume) {
        this.nume = nume;
    }

    @Override
    public void attack(Boxer opponent) {

    }

    @Override
    public int defend() {
        return 0;
    }
}
