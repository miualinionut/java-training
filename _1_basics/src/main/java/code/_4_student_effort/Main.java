package code._4_student_effort;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    System.out.println("buna ziua lume.");
    Fighter f1 = new Fighter(10,"Nicolae",100);
    Fighter f2 = new Fighter(20,"Paul",100);
    BoxingMatch n = new BoxingMatch(f1,f2);
    System.out.println("The winner is " + n.fight());
  }
}
