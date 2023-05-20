package code._3_in_class;

public class Boxer implements IBoxer {

     String name;
     int health = 100;
     int damagePerAttack = 10;

     public void attack(Boxer opponent) {
         opponent.health -= damagePerAttack;
     };
     public int defend(){
         return 0;
     };

     public Boxer(String nume, int health, int damagePerAttack){
         this.name = name;
         this.health = health;
         this.damagePerAttack =damagePerAttack;
     }
}
