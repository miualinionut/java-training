package code._4_student_effort.challenge1;

public class Fighter {

    String name;
    int health;
    int damagePerAttack;

    Fighter() {
    }

    ;

    Fighter(String name, int health, int damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    String attack(Fighter opponent) {
        String castigator = null;

        while (this.health > 0 && opponent.health > 0) {
            opponent.health = opponent.health - this.damagePerAttack;


            if (opponent.health <= 0) {
                castigator = this.name;

            } else {

                this.health = this.health - opponent.damagePerAttack;
                if (this.health <= 0) {
                    castigator = opponent.name;
                }
            }

        }
        return castigator;
    }
}