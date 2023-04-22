package code._3_in_class;

public class Boxer {

     String name;
     int health = 100;
     int damagePerAttack = 10;

     void attack(Boxer opponent) {
         opponent.health -= damagePerAttack;
     };
     void defend(){};

     public Boxer(String nume, int health, int damagePerAttack){
         this.name = name;
         this.health = health;
         this.damagePerAttack =damagePerAttack;
     }
}
