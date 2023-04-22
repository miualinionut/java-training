package code._4_student_effort;

public interface Fighters {
    int attackDamage = 0;
    int health = 20;
    int defencePoints = 0;
    String name = "";
    public int getAttackDamage();
    public String getName();

    public void setAttackDamage(int attackDamage);

    public int getHealth();

    public void setHealth(int health);

    public int getDefencePoints();
    public void setDefencePoints(int defencePoints);

}
