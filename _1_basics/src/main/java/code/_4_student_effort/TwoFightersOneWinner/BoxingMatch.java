package code._4_student_effort.TwoFightersOneWinner;

public class BoxingMatch {
    Fighter fighter1;
    Fighter fighter2;
    public BoxingMatch(Fighter f1, Fighter f2) {
        this.fighter1 = f1;
        this.fighter2 = f2;
    }
    public String fight() {
        String s = "";
        while((fighter1.getHealth() > 0) && (fighter2.getHealth() > 0)) {
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
        }
        if(this.fighter1.getHealth() <= 0) {
           s = fighter2.getName();
        } else if(this.fighter2.getHealth() <= 0) {
            s =  fighter1.getName();
        }
        return s;
    }

    public static void main(String[] args) {
        Fighter f1 = new Fighter("Fighter1", 200, 20);
        Fighter f2 = new Fighter("Fighter2", 200, 10);
        BoxingMatch box = new BoxingMatch(f1, f2);
        System.out.println(box.fight());
    }

}
