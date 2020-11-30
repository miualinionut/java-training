package code._4_student_effort;

public class BoxingMatch {
    private Fighter fighter1;
    private Fighter fighter2;

    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;

        System.out.println(fight());
    }

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Marcus", 300, 71);
        Fighter fighter2 = new Fighter("Aurelius", 280, 73);

        new BoxingMatch(fighter1, fighter2);
    }

    private String fight() {
        int round = 1;

        while(fighter1.health != 0 || fighter2.health != 0) {
            System.out.println("round " + round);

            if(fighter1.health <= 0)
                return fighter2.name;

            if(fighter2.health <= 0)
                return fighter1.name;

            System.out.println(fighter1.name + " hp: " + fighter1.health + " left");
            System.out.println(fighter2.name + " hp: " + fighter2.health + " left");

            fighter2.health = fighter1.attack(fighter2);
            fighter1.health = fighter2.attack(fighter1);

            round++;
        }

        return null;
    }
}

class Fighter {
    public String name = "";

    public int health;
    public int dpA; // short for damagePerAttack

    public Fighter(String name, int health, int dpA) {
        this.name   = name;
        this.health = health;
        this.dpA    = dpA;
    }

    public int attack(Fighter opponent) {
        return opponent.health -= this.dpA;
    }
}