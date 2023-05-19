package code._3_in_class;

public class Boxer implements IBoxer {
    /*
    State: name, health, damagePerAttack
    Behaviour: attack, defend
     */

    String nume;
    int health=100;
    int damagePerAttack=10;
    Glove left;//compozitie
    Glove right;//compozitie

    public Boxer(String nume, int health, int damagePerAttack)
    {
        this.nume=nume;
        this.health=health;
        this.damagePerAttack=damagePerAttack;
    }
    public Boxer(String nume)
    {
        this.nume=nume;
    }

    void puneManusile()//delegare
    {
        left.tie();
        right.tie();
    }
    void daJosManusile(){//delegare
        left.untie();
        right.untie();
    }

    public void attack(Boxer opponent) {

        opponent.health= opponent.health-this.damagePerAttack;
        System.out.println(this.nume + " il ataca pe " + opponent.nume + " - new heath is = " + opponent.health);
    }
    public void defend() {

    }
    public String getNume() {
        return this.nume;
    }

    public boolean isAlive() {
        return this.health>0;
    }
}
