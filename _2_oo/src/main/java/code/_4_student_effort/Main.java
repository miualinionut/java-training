package code._4_student_effort;

public class Fighter implements IFighter {
    String name;
    int health;
    int damagePerAttack;

    public Fighter (String name, int health, int damagePerAttack){
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }
    @Override
    public void attack(Fighter opponent) {
       opponent.health = opponent.health - this.damagePerAttack;
    }

    @Override
    public void collectPunch(int damage){

    }
}
