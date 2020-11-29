package code._4_student_effort;


public class Fighter {
    public String name;
    public int health;
    public int damagePerAttack;

    public Fighter(String new_name, int new_health, int new_damagePerAttack) {
        this.name = new_name;
        this.health = new_health;
        this.damagePerAttack = new_damagePerAttack;
    }

    public void Attack(Fighter Opponent) {
        Opponent.health = Opponent.health - this.damagePerAttack;
    }
}