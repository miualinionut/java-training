package code._3_in_class;
import java.util.Random;
public class Boxer {
    /*
    State: name, health, damagePerAttack;
    Behaviour: attack, defend;
     */

    String nume;
    int health = 100;
    int damagePerAttack =10;
    public Boxer( String nume, int health, int damagePerAttack)
    {
        this.nume = nume;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
    public Boxer (String nume)
    {
        this.nume = nume;
    }
    void attack(Boxer opponent){
        int defendValue = (this.damagePerAttack * this.defend())/100;
        opponent.health= opponent.health - (this.damagePerAttack-defendValue);
        System.out.println("defendValue: "+ defendValue);
        System.out.println("newHealth: " + opponent.health);
    }
   int defend() {
        Random random = new Random();
        int defendPercentage= random.nextInt(101);
        return defendPercentage;
   }

}
