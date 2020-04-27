package code._4_student_effort;

public class BoxingMatch {
    public Fighter f1, f2;

    public BoxingMatch(Fighter F1, Fighter F2) {
        f1 = F1;
        f2 = F2;
    }

    public String fight() {
        if(f1.getHealth()>f2.getHealth())
            return f1.getName();
        else return f2.getName();
    }
}
