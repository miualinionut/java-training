package code._4_student_effort.Two_Fighters;

public class Fighter {
    private String name;
    private int health;
    private int damagePerAttack;

    public Fighter(String name, int hp, int damage){
        this.name = name;
        this.health = hp;
        this.damagePerAttack = damage;

    }

    public int getHealth(){
        return this.health;
    }
    public void setHealth(int health){
        this.health = health;
    }

    public String getName(){
        return this.name;
    }

    public void attack(Fighter fighter){
        int newHealth = fighter.getHealth();
        newHealth -= this.damagePerAttack;
        fighter.setHealth(newHealth);

    }



}
