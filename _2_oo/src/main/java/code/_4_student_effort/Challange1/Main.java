package code._4_student_effort.Challange1;

public class Main {
    public static void main(String[] args)
    {
        Fighter f1 = new Fighter("John Cena",100,20);
        Fighter f11 = new Fighter("Randy Orton",140,10);

        Fighter f2 = new Fighter("Triple H", 150, 40);
        Fighter f22 = new Fighter("Rick Flair", 200, 30);

        Fighter f3 = new Fighter("Rey Mysterio", 160, 35);
        Fighter f33 = new Fighter("Undertaker",250,45);

        BoxingMatch match1 = new BoxingMatch(f1,f11);
        System.out.println(match1.fight());

        BoxingMatch match2 = new BoxingMatch(f2,f22);
        System.out.println(match2.fight());

        BoxingMatch match3 = new BoxingMatch(f3,f33);
        System.out.println(match3.fight());
    }
}
