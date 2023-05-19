package code._3_in_class;

public class BruceLee extends Boxer implements IBoxer{

    public BruceLee(String nume, int health, int damagePerAttack)
    {
       super(nume, health, damagePerAttack);
    }
    public BruceLee(String nume)
    {
        super(nume);
    }

    public void attack(Boxer opponent) {
        opponent.health= 0;
        System.out.println(this.nume + " il ataca pe " + opponent.nume + " - new heath is = " + opponent.health);
    }
    public void defend() {}
    public boolean isAlive() {
        return this.health>0;
    }
}
