package code._4_student_effort.TwoFightersOneWinner;

public class Fighter{
    public final String name ;
    public final int damagePerAttack ;
    public int health ;

    public Fighter(String name, int damagePerAttack, int health) {
        this.name = name;
        this.damagePerAttack = damagePerAttack;
        this.health = health;
    }

    public void attack(Fighter enemy){
        enemy.health -= this.damagePerAttack;
    }
}
