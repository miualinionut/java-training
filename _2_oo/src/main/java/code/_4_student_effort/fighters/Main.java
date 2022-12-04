package code._4_student_effort.fighters;

import code._4_student_effort.fighters.BoxingMatch;
import code._4_student_effort.fighters.Fighter;

public class Main {

    public static void main(String[] args) {
        //TODO put your code changes in here
        Fighter f1= new Fighter("Tyson",80,25);
        Fighter f2= new Fighter("Douglas",100,15);
        BoxingMatch match=new BoxingMatch(f1,f2);
        System.out.println(match.fight());
    }
}
