package code._4_student_effort._1_two_fighters;

public class Fighter {
    private final String name;
    private double health;
    private double damagePerAttack;

    public Fighter(String name, double health, double damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public String getName() {
        return name;
    }

    public double getHealth() {
        return health;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getDamagePerAttack() {
        return damagePerAttack;
    }

    public void setDamagePerAttack(double damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void attack(Fighter opponent) {
        if (!isAlive())
            return;
        opponent.setHealth(opponent.getHealth() - damagePerAttack);
        opponent.setDamagePerAttack(opponent.getDamagePerAttack() * 0.8);
    }

    public void attackDetailed(Fighter opponent) {
        if (!isAlive())
            return;
        System.out.println(name + " smacked " + opponent.getName() + " for " + (int) damagePerAttack + " damage!!");
        opponent.setHealth(opponent.getHealth() - damagePerAttack);
        opponent.setDamagePerAttack(opponent.getDamagePerAttack() * 0.8);
    }
}
