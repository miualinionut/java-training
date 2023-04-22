package code._4_student_effort;

import java.lang.reflect.Constructor;

public class Boxer implements Fighters{
    int attackDamage = 10;
    int health = 100;
    String name = "";
    int defencePoints = 5;
    int attackCount = 0;
    int specialAttack = 0;
    public Boxer (String name, int damageAttack, int health , int defencePoints, int specialAttack){
        this.attackDamage= damageAttack;
        this.health = health;
        this.defencePoints = defencePoints;
        this.name = name;
        this.specialAttack = specialAttack;
    }
    public Boxer (){

    }
    @Override
    public int getAttackDamage() {
        return attackDamage;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setAttackDamage(int attackDamage) {
        this.attackDamage = attackDamage;
    }
    @Override
    public int getHealth() {
        return health;
    }
    @Override
    public void setHealth(int health) {
        this.health = health;
    }
    @Override
    public int getDefencePoints() {
        return defencePoints;
    }
    @Override
    public void setDefencePoints(int defencePoints) {
        this.defencePoints = defencePoints;
    }

    public void attack (Fighters opponent) {
        System.out.println();
        System.out.println(this.name + " ataca!");
        this.attackCount ++;
        if(this.attackCount == this.specialAttack){
            this.attackCount = 0;
            System.out.println("    " + this.name + " are o lovitura sigura!!!!");
            opponent.setHealth(opponent.getHealth() - this.attackDamage);
            System.out.println("        " + opponent.getName() + " a primit:" + this.attackDamage + "!  Viata ramasa:" + opponent.getHealth());
        }
        if(this.attackDamage > opponent.defencePoints) {
            opponent.setHealth(opponent.getHealth() - this.attackDamage + opponent.getDefencePoints());
            System.out.println("    " + opponent.getName() + " a primit:" + (this.getAttackDamage() - opponent.getDefencePoints()) + " .Viata ramasa:" + opponent.getHealth());
        }else {
            this.health = opponent.getDefencePoints() - this.attackDamage;
            System.out.println("    " + opponent.getName() + " a blocat atacul! Viata ramasa:" + this.health);
        }
    }

}
