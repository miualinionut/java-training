package code._4_student_effort;

public class Fighter {
    String name;
    Integer health, damagePerAttack;

    public void attack(Fighter opponent){
        opponent.health = opponent.health - this.damagePerAttack;

    }

}
