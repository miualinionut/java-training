import org.jetbrains.annotations.NotNull;

public class Fighter {

      private String name;
     private int health;
    private  int damagePerAttack;

    public Fighter (String name, int health, int damagePerAttack)
    {
        this.name=name;
        this.health=health;
        this.damagePerAttack=damagePerAttack;
    }

    public String getName()
    {
        return this.name;
    }

    public int getHeath()
    {
       return this.health;
    }

    public int getDamagePerAttack() {
        return this.damagePerAttack;
    }

    public void setName( String name)
    {
        this.name = name;
    }

    public void setHeath ( int health)
    {
        this.health = health;
    }

    public void setDamagePerAttack(int damagePerAttack) {
        this.damagePerAttack = damagePerAttack;
    }

    public int attack(@NotNull Fighter opponent)
    {
        opponent.health = opponent.health-damagePerAttack;
        return opponent.health;
    }

}
