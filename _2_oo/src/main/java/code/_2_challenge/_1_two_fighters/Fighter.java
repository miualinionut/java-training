package code._2_challenge._1_two_fighters;

public class Fighter {
  public final String name;
  public final int damagePerAttack;
  public int health;

  public Fighter(String name, int health, int damagePerAttack) {
    this.name = name;
    this.health = health;
    this.damagePerAttack = damagePerAttack;
  }

  public void attack(Fighter opponent) {
    opponent.health = opponent.health - this.damagePerAttack;
  }
}
