package code._4_student_effort;

public class Fighter {
    public String name;
    public int health;
    public int damagePerAttack;

    public void attack(Fighter opponent) {
        opponent.health = opponent.health - this.damagePerAttack;
    }
    public Fighter(String name, int heath, int damagePerAttack) {
        this.name = name;
        this.health = heath;
        this.damagePerAttack = damagePerAttack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeath() {
        return health;
    }

    public void setHeath(int heath) {
        this.health = heath;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    public void setDamagePerAttack(int damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }
}
