package code._4_student_effort._twoFighters;

public class Main {

  public static void main(String[] args) {
    String winner;
    Fighter fighter_1 = new Fighter("Mike Tyson", 100, 10);
    Fighter fighter_2 = new Fighter("Muhammad Ali ", 100, 11);

    BoxingMatch finalMatch = new BoxingMatch(fighter_1, fighter_2);

    winner = finalMatch.fight();

    System.out.println(winner);
  }
}
