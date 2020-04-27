package code._4_student_effort._1_Challenge;

public class Fighter {
    //state variables
    public String name;
    public Integer health;
    public Integer damagePerAttack;

    //methods
    public Fighter(String n, Integer h, Integer d){
        this.name = n;
        this.health = h;
        this.damagePerAttack = d;
    }
    public void attack(Fighter sth){
        sth.health = sth.health - this.damagePerAttack;
    };
}
