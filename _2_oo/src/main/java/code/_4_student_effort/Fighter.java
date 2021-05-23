package code._4_student_effort;

public class Fighter {
        public String name;
        public int damagePerAttack;
        public int health;

        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }

        public void attack(code._2_challenge._1_two_fighters.Fighter opponent) {
            opponent.health = opponent.health - this.damagePerAttack;
        }
}
