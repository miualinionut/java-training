package code._4_student_effort;

public class Fighter {

    public String name;
    public int health;
    public int damagePerAttack;

    Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    void attack(Fighter opponent) {
        opponent.health = opponent.health - this.damagePerAttack;
    }


}
