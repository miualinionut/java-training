package code._4_student_effort;

public class Main {

  public static void main(String[] args) {
    //System.out.println("Hello World!");


    Fighter fighter1 = new Fighter();
    fighter1.name = "Jack";
    fighter1.health = 100;
    fighter1.damagePerAttack = 15;

    Fighter fighter2 = new Fighter();
    fighter2.name = "Greg";
    fighter2.health = 100;
    fighter2.damagePerAttack = 30;

    BoxingMatch.fight(fighter1, fighter2);


  }
}
