package code._4_student_effort;

public class Fighter {
    public  final String name;
    public  int health;
    public  int damagePerAttack;

    public Fighter(String name , int health ,int damagePerAttack){
        this.name = name;
        this.damagePerAttack = damagePerAttack;
        this.health = health;
    }

    public void attack(Fighter opponent){ opponent.health = opponent.health - this.damagePerAttack;}

}
