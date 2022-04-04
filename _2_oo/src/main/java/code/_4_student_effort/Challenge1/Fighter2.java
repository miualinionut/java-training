package code._4_student_effort.Challenge1;

public class Fighter2 {

    public String name;
    public int health;
    public final int damagePerAttack;

    public Fighter2 (String name, int health, int damagePerAttack)
    {
        this.name= name;
        this.health  = health;
        this.damagePerAttack = damagePerAttack;
    }
    void attack(Fighter2 opponent){

            opponent.health -= this.damagePerAttack;

    }


}
