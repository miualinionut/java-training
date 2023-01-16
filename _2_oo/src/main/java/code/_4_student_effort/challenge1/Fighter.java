package code._4_student_effort.challenge1;

public class Fighter {

    public String name;
    public int health, damagePerAttack;

    public Fighter(String name, int health, int damagePerAtack)
    {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAtack;
    }

    public void attack(Fighter opponent)
    {
        opponent.health -= this.damagePerAttack;
        System.out.println("The fighter " + this.name + " has damaged " + opponent.name + " by " + this.damagePerAttack);
    }


}