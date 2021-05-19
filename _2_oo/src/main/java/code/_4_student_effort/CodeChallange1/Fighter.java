package code._4_student_effort.CodeChallange1;

public class Fighter {
    private final String name;
    private int health;
    private final int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter opponent){
        opponent.reduceHealth(this.damagePerAttack);
    }

    public void reduceHealth(int damage){
        this.health -= damage;
    }

    public int getHealth(){
        return this.health;
    }

    public String getName(){
        return this.name;
    }
}
