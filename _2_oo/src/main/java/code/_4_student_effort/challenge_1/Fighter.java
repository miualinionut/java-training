package code._4_student_effort.challenge_1;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    Fighter(String inputName, int inputHealth, int inputDamage) {
        name = inputName;
        health = inputHealth;
        damagePerAttack = inputDamage;
    }

    public void attack(Fighter opponent) {
        opponent.health -= this.damagePerAttack;
    }

    public boolean hasHP() {
        return this.health > 0;
    }

    public String getName() {
        return name;
    }
}
