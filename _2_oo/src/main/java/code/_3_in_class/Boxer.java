package code._3_in_class;

public class Boxer {

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

    void attack(Boxer opponent){
        opponent.health = opponent.health - this.damagePerAttack;
        System.out.println(this.name + " il ataca pe " + opponent.name + '\n' +
                this.name + " health = " + this.health + " " + opponent.name + " health = " + opponent.health );
    }
    void defend () {}
}
