package code._4_student_effort._1_Two_Fighters;

public class FIGHTER {
    private final String name;
    private int heath;
    private final int damagePerAttack;

    public FIGHTER(String name, int heath, int damagePerAttack){
        this.name=name;
        this.heath=heath;
        this.damagePerAttack=damagePerAttack;
    }
    public void attack(FIGHTER opponent){
        opponent.heath=opponent.heath-this.damagePerAttack;
    }
    int getHeath(){
        return this.heath;
    }
    String getName(){
        return this.name;
    }
}
