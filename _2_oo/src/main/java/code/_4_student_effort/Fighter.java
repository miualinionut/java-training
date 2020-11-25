package code._4_student_effort;

public class Fighter {

    public String name;
    public int health;
    public int damagePerAttack;

    public Fighter() {
        this.name = "default fighter";
        this.health = 100;
        this.damagePerAttack = 10;
    }

    public Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public static void attack(Fighter attacker, Fighter defender){
        System.out.println(attacker.name + " attacks " + defender.name);
        defender.health = defender.health - attacker.damagePerAttack;
        System.out.println(attacker.name + " dealt " +attacker.damagePerAttack +
                " damage to " + defender.name);
        System.out.println(defender.name + " now has " + defender.health + " health left ");
    }


}
