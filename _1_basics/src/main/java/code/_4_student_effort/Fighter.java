package code._4_student_effort;

public class Fighter {

    //state
    String name;
    int health;
    int damagePerAttack;

    public Fighter(String name, int health, int damagePerAttack){
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    //behaviour
    void attack(Fighter f) {
        System.out.println("The fighter " + this.name + " attacks the fighter" + f.name);
        f.health = f.health - this.damagePerAttack;
    }

}
