package code._4_student_effort.code.challenge1;

public class Main {

    public static void main(String[] args) {
        Fighter fighter1=new Fighter("Bianca", 2, 4);
        Fighter fighter2=new Fighter("Ionela", 4, 7);
        BoxingMatch boxingMatch=new BoxingMatch(fighter1, fighter2);
        System.out.println(  boxingMatch.fight());
        //TODO put your code changes in here
    }
}
