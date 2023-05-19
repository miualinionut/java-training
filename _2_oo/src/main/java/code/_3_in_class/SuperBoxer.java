package code._3_in_class;

public class SuperBoxer implements IBoxer {

    String nume;
    int health;
    int damagePerAttack;

    public SuperBoxer(String nume)
    {
        this.nume=nume;
    }

    public String getNume() {
        return this.nume;
    }

    @Override
    public void attack(Boxer opponent) {

    }

    @Override
    public void defend() {

    }
    public boolean isAlive() {
        return this.health>0;
    }
}
