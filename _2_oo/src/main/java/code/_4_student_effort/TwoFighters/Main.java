package code._4_student_effort.TwoFighters;

public class Main {

    public static void main(String[] args) {
        Fighter fighter1=new Fighter("F1", 100, 15);
        Fighter fighter2=new Fighter("F2", 150, 25);

        BoxingMatch box1=new BoxingMatch(fighter1,fighter2);

        System.out.println("The winner is: " + box1.fight());
    }
}
