package code._4_student_effort.two_fighters_one_winner;

public class Fighter {
    protected String name;
    protected int health;
    protected int damagePerAttack;

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

    public void attack(Fighter opponent) {
        opponent.health = opponent.health - damagePerAttack;
    }
}
