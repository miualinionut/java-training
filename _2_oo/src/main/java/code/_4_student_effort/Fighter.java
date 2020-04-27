package code._4_student_effort;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter(String n, int h, int dPA) {
        name = n;
        health = h;
        damagePerAttack = dPA;
    }

    public String getName() {
        return name;
    }

    public int getHealth(){
        return health;
    }
    public int getDamagePerAttack(){
        return damagePerAttack;
    }
    public void attack(Fighter opponent){
        opponent.health=opponent.health-damagePerAttack;
    }
}
