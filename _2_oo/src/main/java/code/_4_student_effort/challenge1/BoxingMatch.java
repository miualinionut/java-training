package code._4_student_effort.challenge1;

public class BoxingMatch {

    private Fighter f1;
    private Fighter f2;
    public BoxingMatch(Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public static void main(String[] args) {
        Fighter f1 = new Fighter("Doroftei", 130, 15);
        Fighter f2 = new Fighter("Muhamad", 90, 30);
        BoxingMatch boxingMatch = new BoxingMatch(f1, f2);
        System.out.println("The winner of the fight is " + boxingMatch.fight());

    }

    public String fight()
    {
        while(f1.health > 0 && f2.health > 0)
        {
            f1.attack(f2);
            if(f2.health > 0)
                f2.attack(f1);
        }
        if(f1.health <= 0)
            return f2.name;
        else
            return f1.name;
        //return "egaltiate" ;
    }
}
