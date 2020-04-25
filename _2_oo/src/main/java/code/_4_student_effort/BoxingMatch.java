package code._4_student_effort;

public class BoxingMatch {
    public Fighter f1;
    public Fighter f2;

    public BoxingMatch(Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public String fight() {
        do {
            f1.attack(f2);
            f2.attack(f1);
        } while (f1.health > 0 && f2.health > 0);

        if (f1.health <= 0) {
            return f1.name;
        } else {
            return f2.name;
        }
    }

    public static void main(String[] args) {
        Fighter f1 = new Fighter("Gladiator", 10, 3);
        Fighter f2 = new Fighter("Knight", 12, 5);
        BoxingMatch b = new BoxingMatch(f1, f2);
        System.out.println(b.fight());
    }
}