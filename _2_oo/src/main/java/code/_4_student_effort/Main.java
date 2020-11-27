package code._4_student_effort;

public class Main {

  public static void main(String[] args) {
    Fighter f1 = new Fighter("Robert" , 100 , 20) ;
    Fighter f2 = new Fighter("Goku" , 100 , 10);
    BoxingMatch boxingMatch = new BoxingMatch(f1,f2);
    String winner = boxingMatch.fight();
    System.out.println(winner);
  }
}
