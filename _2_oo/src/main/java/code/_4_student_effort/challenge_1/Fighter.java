package code._4_student_effort.challenge_1;

public class Fighter {
    public String name;
    public int health, damagePerAttack;

    public Fighter( String name, int health, int damagePerAttack){
        this.name=name;
        this.health=health;
        this.damagePerAttack=damagePerAttack;
    }

    public void attack(Fighter opponent){
        opponent.health=opponent.health-this.damagePerAttack;
    }
}
