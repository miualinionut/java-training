package code._4_student_effort;

import java.util.Random;

public class BoxingMatch {
    Random rand = new Random();
    String winner;
    Fighter opponent1;
    Fighter opponent2;

    public BoxingMatch(Fighter opponent1, Fighter opponent2) {
        this.opponent1 = opponent1;
        this.opponent2 = opponent2;

    }

    public String fight(Fighter fighter1, Fighter fighter2) {

        while (fighter2.getHealth() > 0 || fighter1.getHealth() > 0) {
            int whoHits = rand.nextInt(4);
            fighter1.setDamagePerAtack(rand.nextInt(5) + 1);
            fighter2.setDamagePerAtack(rand.nextInt(5) + 1);
            if (whoHits > 2) {
                fighter2.setHealth((byte) (fighter2.getHealth() - fighter1.getDamagePerAtack()));
            } else {
                fighter1.setHealth((byte) (fighter1.getHealth() - fighter2.getDamagePerAtack()));
            }
        }
            if(fighter1.getHealth() > fighter2.getHealth())
            {
                winner = fighter1.getName();
            }else
                winner = fighter2.getName();

        System.out.println("The winner is " + winner);
        return winner;
    }
}