package code._4_student_effort.two_fighters_one_winner;

public class Fighter {
    private final String name;
    private int health;
    private final int damagePerAttack;

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

    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    public void setHealth(int health) {
        if (health < getHealth())
            this.health = health;
    }

    public void attack(Fighter opponent) {
        opponent.setHealth(opponent.getHealth() - getDamagePerAttack());
    }
}
