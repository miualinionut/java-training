package code._4_student_effort.challenge_1;

public class BoxingMatch {
    public Fighter f1;
    public Fighter f2;

    public BoxingMatch(Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public String fight(Fighter f1, Fighter f2) {
        while (f1.health > 0 && f2.health > 0) {
            f1.attack(f2);
            f2.attack(f1);
        }
        if (f1.health <= 0) {
            return f1.name;
        } else {
            return f2.name;
        }
    }

    public static void main(String[] args) {
        Fighter f1 = new Fighter("John",100,20);
        Fighter f2 = new Fighter("Mark", 100, 10);
        BoxingMatch match=new BoxingMatch(f1,f2);
        String winner=match.fight(f1,f2);
        System.out.println(winner);

    }
}
