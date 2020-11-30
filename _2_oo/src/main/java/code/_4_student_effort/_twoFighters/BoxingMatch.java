package code._4_student_effort._twoFighters;

public class BoxingMatch {
    private Fighter Fighter_1;
    private Fighter Fighter_2;

    public BoxingMatch (Fighter fighter_1, Fighter fighter_2) {
        Fighter_1 = fighter_1;
        Fighter_2 = fighter_2;
    }

    public String fight() {
        String winner = "";
        while(Fighter_1.getHeath() > 0 && Fighter_2.getHeath() > 0) {
            Fighter_1.attack(Fighter_2);
            Fighter_2.attack(Fighter_1);
        }

        if(Fighter_1.getHeath() > Fighter_2.getHeath())
            winner = "Winner is: " + Fighter_1.getName();
        else if (Fighter_1.getHeath() < Fighter_2.getHeath())
            winner = "Winner is: " + Fighter_2.getName();
        else
            winner = "Deuce";

        return winner;
    }

}
