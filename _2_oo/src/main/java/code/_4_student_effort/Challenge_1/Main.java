package code._4_student_effort.Challenge_1;

public class Main {

  public static void main(String[] args) {
    Fighter f1=new Fighter("Mark",10,2);
    Fighter f2=new Fighter("Jack",10,5);
    f1.attack(f2);
    f1.attack(f2);
    f2.attack(f1);
    f1.setDamagePerAttack(6);
    f1.attack(f2);
    BoxingMatch b=new BoxingMatch(f1,f2);
    System.out.println(f1.getName()+" "+f1.getHealth()+" "+f1.getDamagePerAttack());
    System.out.println(f2.getName()+" "+f2.getHealth()+" "+f2.getDamagePerAttack());
    System.out.println("Castigatorul este "+b.fight());
  }
}
