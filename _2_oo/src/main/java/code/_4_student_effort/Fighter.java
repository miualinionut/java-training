package code._4_student_effort;

public class Fighter {
    String name;
    int damagePerAttack;

    public int attack(Fighter opponent) {
        return this.damagePerAttack - opponent.damagePerAttack;
    }
}
