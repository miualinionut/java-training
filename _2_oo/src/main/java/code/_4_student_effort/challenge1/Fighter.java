package code._4_student_effort.challenge1;

public class Fighter {

    private String name;
    private int health;
    private int dmgPerAtack;

    public Fighter(String name, int health, int dmgPerAtack) {
        this.name = name;
        this.health = health;
        this.dmgPerAtack = dmgPerAtack;
    }

    public String getName() {

        return name;
    }

    public int getHealth() {
        return health;
    }

    public int getDmgPerAtack() {
        return dmgPerAtack;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDmgPerAtack(int dmgPerAtack) {
        this.dmgPerAtack = dmgPerAtack;
    }

    public void atack(Fighter opponent ){

        int health = opponent.getHealth() - this.getDmgPerAtack();
        opponent.setHealth(health);
    };
}
