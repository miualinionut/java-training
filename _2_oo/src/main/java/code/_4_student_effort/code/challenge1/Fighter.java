package code._4_student_effort.code.challenge1;

public class Fighter {
    private String name;
    private int heath;
    private int damagePerAttack;
    private Fighter attack;
    public Fighter(String name, int heath, int damagePerAttack) {
        this.name = name;
        this.damagePerAttack = damagePerAttack;
        this.heath = heath;
    }

    public int getDamagePerAttack() {
        return damagePerAttack;
    }

    public int getHeath() {
        return heath;
    }

    public String getName() {
        return name;
    }
}
