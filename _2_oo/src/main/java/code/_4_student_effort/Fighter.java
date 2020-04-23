package code._4_student_effort;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter(String n, int h, int dmg) {
        name = n;
        health = h;
        damagePerAttack = dmg;
    }

    public void attack(Fighter opponent) {
        opponent.health = opponent.health - damagePerAttack;
    }

    public int getHealth() {
        return health;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    public void setDamagePerAttack(int damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }

    public String getName() {
        return name;
    }
}
