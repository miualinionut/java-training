package code._4_student_effort;

public class Fighter {
    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    private String name;
    private int health;
    private int damagePerAttack;

    public void Attack(Fighter opponent) {
        opponent.health -= this.damagePerAttack;
    }
}
