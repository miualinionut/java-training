package code._3_in_class;
import java.util.Random;

public class Boxer {
    String nume;
    int health=100;
    int damagePerAttack=10;

    public Boxer(String nume, int health, int damagePerAttack){
        this.nume=nume;
        this.health=health;
        this.damagePerAttack=damagePerAttack;
    }
    public Boxer(String nume){
        this.nume=nume;
    }

    public void attak(Boxer opponent){
        int defendValue=(this.damagePerAttack*this.defend())/100;
        opponent.health=opponent.health-(this.damagePerAttack+this.defend())/100;
        System.out.println(("defendValue: "+defendValue));
        System.out.println(("newHealth: "+opponent.health));
    }

    public void defend() {
        Random random=new Random();
        int defendPerc = random.nextInt(101);
        return defendPerc;
    }
}
