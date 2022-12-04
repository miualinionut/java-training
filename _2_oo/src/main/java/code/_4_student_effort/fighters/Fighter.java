package code._4_student_effort.fighters;

public class Fighter {
    public final String name;
    public int health;
    public final int  damagePerAttack;
    public Fighter(String name,int health,int damagePerAttack){
        this.name=name;
        this.health=health;
        this.damagePerAttack=damagePerAttack;
    }
    public void attack(Fighter opponent){
        opponent.health-=damagePerAttack;
    }
}
