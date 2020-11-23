package code._4_student_effort.two_fighters;


public class Fighter {
    String name;
    double health;
    double damagePerAttack;
    public Fighter(String name, double health, double damagePerAttack){
        this.name=name;
        this.health=health;
        this.damagePerAttack=damagePerAttack;
    }
    void attack (Fighter opponent){
        opponent.health= opponent.health>this.damagePerAttack?
                opponent.health-this.damagePerAttack : 0;
    }
}
