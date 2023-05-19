package code._3_in_class;

import java.util.Random;

public class Boxer implements IBoxer {

    String name;
    int health=100;
    int damagePerAttack=10;


    public Boxer(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public Boxer(String name) {
        this.name = name;
    }

    public void attack(Boxer opponent){
        int defend = (this.damagePerAttack * this.defend())/100;
        opponent.health = opponent.health - (this.damagePerAttack - defend);
        System.out.println(this.name + " il ataca pe " + opponent.name + '\n' +
                this.name + " health = " + this.health + " " + opponent.name + " health = " + opponent.health );
    }

    public int defend() {
        Random ran = new Random();
        return ran.nextInt(101);
    }
}
