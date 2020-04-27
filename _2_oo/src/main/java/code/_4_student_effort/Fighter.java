package code._4_student_effort;

public class Fighter {
    public String name;
    public int damagePerAttack;
    public int health;

    public Fighter(String name, int damagePerAtack, int health) {
        this.name = name;
        this.damagePerAttack = damagePerAtack;
        this.health = health;
    }

    public void attack(Fighter opponent) {
        opponent.health = opponent.health - this.damagePerAttack;
    }
}
