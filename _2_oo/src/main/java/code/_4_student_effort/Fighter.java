package code._4_student_effort;

import java.util.Random;

public class Fighter {

    public final String name;
    public Double damage;
    public Double health;
    public Integer defence;
    public String punch;

    public Fighter(String name, Double damage, Double health) {
        this.name = name;
        this.damage = damage;
        this.health = health;
    }

    public Double typeOfPunch() {//1=jab=0.6,2=cross,3=hook,4=uppercut
        Random random = new Random();
        int chance = random.nextInt(4);
        if (chance == 0) {
            this.punch = " a Jab";
            return this.damage * 0.6;
        } else if (chance == 1) {
            this.punch = " a Cross";
            return this.damage;
        } else if (chance == 2) {
            this.punch = " a Hook";
            return this.damage * 1.3;
        } else {
            this.punch = " an Uppercut";
        }
        return this.damage * 1.5;
    }

    public void attack(Fighter opponent) {
        System.out.println(this.name + " is attacking!\n");
        Random random = new Random();
        int chance = random.nextInt(100);
        if (opponent.defence == 1 && chance > 25) {
            double damageGiven = typeOfPunch();
            opponent.health = opponent.health - damageGiven;
            System.out.println(opponent.name + " got punched for " + damageGiven + " with" + this.punch + "!\n");
        } else if (opponent.defence == 1 && chance < 25) {
            System.out.println(opponent.name + " dodged the attack!\n");
        }
        if(opponent.defence==2&&chance>50){
            opponent.health=opponent.health-this.damage;
            System.out.println(opponent.name+" got punched for "+this.damage+"\n");
        } else if (opponent.defence==2&&chance<50) {
            System.out.println(opponent.name+" dodged the attack!\n");
        }
        if (opponent.defence == 3 && chance > 65) {
            double damageGiven = typeOfPunch();
            opponent.health = opponent.health - damageGiven;
            System.out.println(opponent.name + " got punched for " + damageGiven + " with" + this.punch + "!\n");
        } else if (opponent.defence == 3 && chance < 65) {
            System.out.println(opponent.name + " dodged the attack!\n");
        }
    }

    public String getName() {
        return name;
    }

    public Double getDamage() {
        return damage;
    }

    public void setDamage(Double damage) {
        this.damage = damage;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    public Integer getDefence() {
        return defence;
    }

    public void setDefence(Integer defence) {
        this.defence = defence;
    }

    public String getPunch() {
        return punch;
    }

    public void setPunch(String punch) {
        this.punch = punch;
    }
}
