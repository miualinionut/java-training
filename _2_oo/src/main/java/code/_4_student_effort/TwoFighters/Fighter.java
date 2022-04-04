package code._4_student_effort.TwoFighters;

public class Fighter {
    String name;
    float health;
    int damagePerAttack;

    public Fighter(String name, float health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter opponent){
        System.out.println("Fighting"+opponent.name);
    }
}
