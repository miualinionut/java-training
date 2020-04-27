package code._4_student_effort._1_Challenge;

public class Fight {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("marian", 100, 25);
        Fighter fighter2 = new Fighter("balan", 100, 30);

        Fighter me = new Fighter("malina", 100, 50);
        Fighter myBf = new Fighter("geo", 100, 10);

        BoxingMatch fight1 = new BoxingMatch(fighter1, fighter2);
        String win = fight1.fight();

        System.out.println(win);

        BoxingMatch fight_supreme = new BoxingMatch(me, myBf);
        String ultimate = fight_supreme.fight();

        System.out.println(ultimate);
    }
}
