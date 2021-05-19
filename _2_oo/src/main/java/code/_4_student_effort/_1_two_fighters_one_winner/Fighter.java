package code._4_student_effort._1_two_fighters_one_winner;

public class Fighter {
    public String name;
    public int health;
    public int damagePerAttack;

    public Fighter(String name, int damagePerAttack) {
        this.name = name;
        this.damagePerAttack = damagePerAttack;
        this.health = 100;
    }

    public void attack(Fighter opponent) {
        opponent.health -= this.damagePerAttack;
    }
}
