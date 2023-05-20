package code._3_in_class;

public class BruceLee extends Boxer{
    public BruceLee(String nume, int health, int damagePerAttack) {
        super(nume, health, damagePerAttack);
    }

    public BruceLee(String nume) {
        super(nume);
    }

    void attack(Boxer opponent) {
        System.out.println(this.nume+"il ataca pe" +opponent.nume+"- new health is"+opponent.health);
        opponent.health=opponent.health-this.damagePerAttack;
    }
}
