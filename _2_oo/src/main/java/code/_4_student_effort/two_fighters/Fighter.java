package code._4_student_effort.two_fighters;

public class Fighter {
    private String name;
    private float health;
    private float damagePerAttack;
    void attack(Fighter opponent){
        float final_health = opponent.getHealth() - this.damagePerAttack;
        opponent.setHealth(final_health);
    }

    public Fighter(String name, float health, float damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(float health) {
        this.health = health;
    }

    public void setDamagePerAttack(float damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }

    public String getName() {
        return name;
    }

    public float getHealth() {
        return health;
    }

    public float getDamagePerAttack() {
        return damagePerAttack;
    }

    public Fighter() {
    }
}
