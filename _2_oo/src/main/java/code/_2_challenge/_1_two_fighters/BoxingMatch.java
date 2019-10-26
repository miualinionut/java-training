package code._2_challenge._1_two_fighters;

public class BoxingMatch {
  private Fighter f1;
  private Fighter f2;

  public BoxingMatch(Fighter f1, Fighter f2) {
    this.f1 = f1;
    this.f2 = f2;
  }

  public String fight() {
    while (f1.health > 0 && f2.health > 0) {
      f1.attack(f2);
      f2.attack(f1);
    }
    if (f1.health <= 0) {
      return f1.name;
    } else {
      return f2.name;
    }
  }

  public static void main(String[] args) {
    Fighter f1 = new Fighter("F1", 100, 10);
    Fighter f2 = new Fighter("F2", 100, 10);
    BoxingMatch boxingMatch = new BoxingMatch(f1, f2);
    String winner = boxingMatch.fight();
    System.out.println(winner);
  }
}
