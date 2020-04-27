package code._4_student_effort;

public class BoxingMatch {

    private Fighter f1;
    private Fighter f2;
    public BoxingMatch (Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }
    public void fight () {
        while (f1.health>0 && f2.health>0) {
            f1.attack(f2);
            f2.attack(f1);
        }
        System.out.print("The winner is: ");
        if (f1.health>0) {System.out.println(f1.name);}
        else {System.out.println(f2.name);}
    }
}
