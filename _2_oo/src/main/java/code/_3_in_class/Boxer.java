package code._3_in_class;

public class Boxer {
    String nume;
    int health = 100;
    int damnagePerAttack = 10;

    public Boxer(String nume, int health, int damnagePerAttack) {
        this.nume = nume;
        this.health = health;
        this.damnagePerAttack = damnagePerAttack;
    }

    public Boxer(String nume){
        this.nume = nume;
    }


    void attack(Boxer opponent){
        opponent.health = opponent.health-this.damnagePerAttack;
    }
    void defend() {}
}
