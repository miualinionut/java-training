package code._4_student_effort.two_fighters;

public class BoxingMatch {
    protected Fighter fighter1;
    protected Fighter fighter2;
    public BoxingMatch(Fighter fighter1, Fighter fighter2) {
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public String fight() {
        while (fighter1.getHealth() > 0 && fighter2.getHealth() > 0) {
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
        }
        if (fighter1.getHealth() <= 0 && fighter2.getHealth() <= 0) {
            return ("Both fighters knocked out simultaneously!");
        }
        if (fighter1.getHealth() <= 0) {
            return (fighter2.getName());}
        if (fighter2.getHealth() <= 0) {
            return (fighter1.getName());
            }
            return ("No winner");

        }


    public static void main(String[] args) {
        Fighter Morosanu = new Fighter("Morosanu", 2000, 50);
        Fighter Valahu = new Fighter("Valahu", 150 , 70);
        BoxingMatch meci_de_box = new BoxingMatch(Morosanu, Valahu);
        String castigator = meci_de_box.fight();
        System.out.println(castigator);
    }


}
