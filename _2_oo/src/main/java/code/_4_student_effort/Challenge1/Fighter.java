package code._4_student_effort.Challenge1;

public class Fighter {

    private String name;
    private float health;
    private float damagePerAttack;

    public Fighter() {
        health = 100;
    }

    public void attack(Fighter opponent){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getHealth() {
        return health;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public float getDamagePerAttack() {
        return damagePerAttack;
    }

    public void setDamagePerAttack(float damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }
}
