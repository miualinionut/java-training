package code._4_student_effort._twoFighters;

public class Fighter {
    private final String Name;
    private int Heath;
    private final int DamagePerAttack;

    public Fighter(String name, int heath, int damagePerAttack) {
        Name = name;
        Heath = heath;
        DamagePerAttack = damagePerAttack;
    }

    public String getName() {
        return Name;
    }

    public int getHeath() {
        return Heath;
    }

    public int getDamagePerAttack() {
        return DamagePerAttack;
    }

    public void setHeath(int damage) {
        Heath -= damage;
    }

    public void attack(Fighter opponent) {
        opponent.setHeath(DamagePerAttack);
    }

}
