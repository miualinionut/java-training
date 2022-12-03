package code._4_student_effort;

import java.util.Random;

public class Fighter {

    public final String name;
    public final Integer damage;
    public  Integer health;
    public Integer defence;

    public Fighter(String name, Integer damage, Integer health, Integer defence) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.defence=defence;
    }

    public void attack(Fighter opponent){
        System.out.println(this.name+" is attacking\n");
        Random random= new Random();
        int chance=random.nextInt(100);
        if(opponent.defence==1&&chance>30){
            opponent.health=opponent.health-this.damage;
            System.out.println(opponent.name+" got punched for "+this.damage+"\n");
        } else if (opponent.defence==1&&chance<25) {
            System.out.println(opponent.name+" dodged the attack!\n");
        }
        if(opponent.defence==2&&chance>50){
            opponent.health=opponent.health-this.damage;
            System.out.println(opponent.name+" got punched for "+this.damage+"\n");
        } else if (opponent.defence==2&&chance<50) {
            System.out.println(opponent.name+" dodged the attack!\n");
        }
        if(opponent.defence==3&&chance>60){
            opponent.health=opponent.health-this.damage;
            System.out.println(opponent.name+" got punched for "+this.damage+"\n");
        } else if (opponent.defence==3&&chance<75) {
            System.out.println(opponent.name+" dodged the attack!\n");
        }
    }
}
