package code._4_student_effort;

import code._4_student_effort.two_fighters.BoxingMatch;
import code._4_student_effort.two_fighters.Fighter;

public class Main {

  public static void main(String[] args) {
    Fighter f1=new Fighter("Fgt1", 100d, 5f);
    Fighter f2=new Fighter("Fgt2", 100d, 3f);
    BoxingMatch match=new BoxingMatch(f1,f2);
    System.out.println(match.fight());
  }
}
