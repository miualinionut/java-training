package code._4_student_effort;

import java.lang.reflect.Constructor;

public class Boxer {
    int health = 100;
    int damageAttack = 10;
    String name;
    public Boxer (String name, int health, int damageAttack ){
        this.damageAttack = damageAttack;
        this.name = name;
        this.health = health;
    }
    public Boxer (String name) {
        this.name = name;
    }
    void attack (Boxer opponent) {
        opponent.health -= this.damageAttack;
        System.out.println(this.name + " a atacat pe " + opponent.name + ", viata ramasa:" + opponent.health);
    }

}
