package code._3_in_class;

import java.util.Random;

public class Boxer {



    String nume;
    int health=100;
    int damagePerHit=10;

    public Boxer(String nume,int health,int damagePerHit) {
        this.nume=nume;
        this.health = health;
        this.damagePerHit=damagePerHit;
    }

    public Boxer(String nume) {
        this.nume = nume;
    }



    void fight(Boxer opponent){
        int defenceValue=this.damagePerHit*this.defence()/100;
        opponent.health-=this.damagePerHit-defenceValue;
        System.out.println(this.nume +" il ataca pe "+opponent.nume+" - new health "+opponent.nume +" = " +opponent.health);


    }

    int defence(){
        Random random =new Random();

        int defencePercentage=random.nextInt(101);

        return defencePercentage;


    }


}
