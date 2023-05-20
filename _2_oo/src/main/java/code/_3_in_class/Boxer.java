package code._3_in_class;

public class Boxer implements IBoxer{
    String nume;
    int health=100;
    int damagePerAttack=10;

    public Boxer(String nume, int health, int damagePerAttack) {
        this.nume = nume;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public Boxer(String nume) {
        this.nume = nume;
    }

    public void attack(Boxer opponent){
        opponent.health = opponent.health - this.damagePerAttack;
        System.out.println(this.nume + " il ataca pe " + opponent.nume + " - new health is = " + opponent.health);
    }
    public int defend() {}
}
