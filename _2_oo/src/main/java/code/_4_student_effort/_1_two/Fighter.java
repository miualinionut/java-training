package code._4_student_effort._1_two;

public class Fighter {
    public String name;
    public int dpr;
    public int health;

    public Fighter(String name, int dpr, int health){
        this.name=name;
        this.dpr=dpr;
        this.health=health;
    }
    public void lupta(Fighter opponent)
    {
        opponent.health=opponent.health - this.dpr;
    }
}
