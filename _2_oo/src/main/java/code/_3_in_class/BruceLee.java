package code._3_in_class;

import javax.swing.*;

public class BruceLee extends Boxer {

    public BruceLee(String nume, int health, int damagePerAttack) {
        super(nume, health, damagePerAttack);
    }

    public BruceLee(String nume) {
        super(nume);
    }
    void attack(Boxer opponent) {
        opponent.health = 0;
        System.out.println(this.nume + " il ataca pe "+ opponent.nume+" - new health is: "+ this.health);
    }
}
