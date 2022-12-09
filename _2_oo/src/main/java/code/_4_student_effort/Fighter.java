package code._4_student_effort;

public class Fighter {
    String name;
    int health;
    int damagePerAttack;
    Fighter(String n, int h, int d){
        this.name = n;
        this.health = h;
        this.damagePerAttack = d;
    }

    public Fighter() {
    }

    public int attack(Fighter  opponent){
        return opponent.health=opponent.health - this.damagePerAttack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    public void setDamagePerAttack(int damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }

    public boolean life(){
        if(this.health<=0)
            return false;
        return true;
    }
}
