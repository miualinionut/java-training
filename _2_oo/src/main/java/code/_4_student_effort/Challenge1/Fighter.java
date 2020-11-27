package code._4_student_effort.Challenge1;

//STAGE 1
//class Fighter
//name, health, dmg
//Attack - behavior
public class Fighter {
    //Variables; public modifier
    public String name;
    public int health;
    public int DamagePerAttack;

    //constructor
    public Fighter(String name, int health, int DamagePerAttack) {
        this.name = name;
        this.health = health;
        this.DamagePerAttack = DamagePerAttack;
    }

    public void Player() {
        System.out.println("Player name: "+name);
        System.out.println("Health: "+health);
        System.out.println("DamagePerAttack: "+DamagePerAttack);
    }

    public void Attack(Fighter enemy) {
        enemy.health = enemy.health - this.DamagePerAttack;
//        int HealthLeft = enemy.health;
//
//        System.out.println(enemy.name + " has " + HealthLeft + " health left");
//        if(HealthLeft < 0){
//            System.out.println(enemy.name + " Lost!");
//            System.out.println("Was killed by " + this.name);
//        }
    }

}
