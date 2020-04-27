package code._4_student_effort;

public class Fighter {
    String name;
    int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack){
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter opponent){
        opponent.health -= this.damagePerAttack;
    }
}
