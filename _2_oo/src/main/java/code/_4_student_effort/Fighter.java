package code._4_student_effort;

public class Fighter {
    private String name;
    private byte health = 100;
    private int damagePerAtack;

    public Fighter(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getHealth() {
        return health;
    }

    public void setHealth(byte health) {
        this.health = health;
    }

    public int getDamagePerAtack() {
        return damagePerAtack;
    }

    public void setDamagePerAtack(int damagePerAtack) {
        this.damagePerAtack = damagePerAtack;
    }


}

