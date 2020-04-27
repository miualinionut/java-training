package code._4_student_effort;

public class BoxingMatch {
    private Fighter F1;
    private Fighter F2;

    public BoxingMatch(Fighter F1, Fighter F2) {
        this.F1 = F1;
        this.F2 = F2;
    }

    public String fight() {
        while (F1.health > 0 && F2.health > 0) {
            F1.attack(F2);
            if (F2.health > 0)
                F2.attack(F1);
        }
        if (F1.health <= 0)
            return F2.name;
        else
            return F1.name;
    }

    public static void main(String[] args) {
        Fighter F1 = new Fighter("Luptator 1", 100, 30);
        Fighter F2 = new Fighter("Luptator 2", 100, 50);
        BoxingMatch B1 = new BoxingMatch(F1, F2);
        System.out.println("Castigatorul este: " + B1.fight());
    }
}