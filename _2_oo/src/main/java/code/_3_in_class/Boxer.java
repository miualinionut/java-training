package code._3_in_class;

public class Boxer {
    String nume;
    int health = 100;
    int dammagePerAttack =10;

    //constructor
    public Boxer(String nume, int health, int dammagePerAttack) {
        this.nume = nume;
        this.health = health;
        this.dammagePerAttack = dammagePerAttack;
    }

    public Boxer(String nume) {
        this.nume = nume;
    }

    void attack(Boxer opponent) {
        opponent.health = opponent.health - this.dammagePerAttack;
        System.out.println(this.nume + "il ataca pe" + opponent.nume +"-new health is =" + opponent.health);
    }
    void defend(){}
}
