package code._3_in_class;

public class Boxer {
    String name;
    int health = 100;
    int damagePerAttack = 10;


    public Boxer(String name, int health, int damage){
        this.name = name;
        this.health = health;
        this.damagePerAttack = damage;
    }
    public Boxer(String name){
        this.name = name;
    }


}
