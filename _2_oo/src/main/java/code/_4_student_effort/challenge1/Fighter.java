package code._4_student_effort.challenge1;

public class Fighter {
    String name;
    int heath;
    int damagePerAttack;
    Fighter(String n, int h,int d){
        name=n;
        heath=h;
        damagePerAttack=d;
    }
    void attack(Fighter f){
        f.heath=f.heath-damagePerAttack;

    }

}
