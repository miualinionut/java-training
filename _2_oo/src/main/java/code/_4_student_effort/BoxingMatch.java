package code._4_student_effort;

public class BoxingMatch {
    public Fighter f1, f2;

    public BoxingMatch(Fighter f11, Fighter f22) {
        f1 = f11;
        f2 = f22;
    }

    public String fight() {
        if (f1.getHealth() > f2.getHealth())
            return f1.getName();
        else return f2.getName();
    }
}
