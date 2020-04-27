package code._4_student_effort.two_fighters_one_winner;

public class Appication {
    public static void main(String[] args) {
        Fighter bute =
                new Fighter("Bute", 100, 27);
        Fighter morosan =
                new Fighter("Morosan", 100, 26);

        System.out.println(new BoxingMatch(bute, morosan).fight());
    }
}
