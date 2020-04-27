package code._4_student_effort.challenge1;

public class Main {

    public static void main(String[] args) {

        //problema 1
        Fighter f1 = new Fighter("Jucatorul 1", 50, 10);
        Fighter f2 = new Fighter("Jucatorul 2", 50, 10);

        BoxingMatch b1 = new BoxingMatch(f1, f2);
        System.out.println(b1.fight());
        //problema 1

    }
}
