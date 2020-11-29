package code._4_student_effort;

public class Fighter {
    final int damagePerAttack;
    final String name;
    public int health;

    public Fighter(int damagePerAttack, String name, int health){
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
    public int attack(String name, int health){
        if(health - damagePerAttack <= 0)
            System.out.println(name + " has no more health");
        else System.out.println("The fighter " + name + " has more " + (health-damagePerAttack) + " health");
        return health - damagePerAttack;
    }
}
