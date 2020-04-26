package code._4_student_effort.Two_fighters;

public class Fighter {
public String name;
public int health;
public int damagePerAttack;

public Fighter(String name, int health, int damage)
{
    this.name=name;
    this.health=health;
    this.damagePerAttack=damage;
}

public void attack(Fighter x)
{
    x.health-=this.damagePerAttack;
}
}
