package code._4_student_effort;

public class Fighter {

    int health;
    String name;
    int damagePerAttack;

    void attack(Fighter opponent){
        opponent.health=opponent.health-this.damagePerAttack;
    }

    public Fighter(int health, String name, int damagePerAttack) {
        this.health = health;
        this.name = name;
        this.damagePerAttack = damagePerAttack;
    }

}
