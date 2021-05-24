package code._4_student_effort;

public class Fighter {
    String name;
    int heath;
    int damagePerAttack;
    public void attack(Fighter opponent){
        opponent.heath -= this.damagePerAttack;
    }
}
