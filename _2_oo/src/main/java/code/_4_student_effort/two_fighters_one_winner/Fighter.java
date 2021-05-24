package code._4_student_effort.two_fighters_one_winner;

public class Fighter {
    public final String name;
    public final double damagePerAttack;
    public double health;

    public Fighter(String name, double health, double damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter opponent) {
        opponent.health -= this.damagePerAttack;
    }
}
