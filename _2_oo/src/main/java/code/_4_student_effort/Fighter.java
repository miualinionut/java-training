package code._4_student_effort;

public class Fighter {
    String name;
    int health;
    int damagePerAttack;
    Fighter(String name, int health, int damagePerAttack){
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
    void attack(Fighter opponent){
        opponent.health -= damagePerAttack;
    }
}
