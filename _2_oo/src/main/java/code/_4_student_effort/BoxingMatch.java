package code._4_student_effort;

public class BoxingMatch {

    Fighter F1;
    Fighter F2;

    public BoxingMatch(Fighter f1, Fighter f2) {
        F1 = f1;
        F2 = f2;
    }

    public void fight(){

        while(F1.health>=0 && F2.health>=0){
            F1.attack(F2);
            F2.attack(F1);
           // System.out.println(F1.health);
           // System.out.println(F2.health);
        }
        if(F1.health<=0 && F2.health>0) System.out.println(F2.name+" wins the fight!");
        else if(F1.health>0 && F2.health<=0) System.out.println(F1.name+" wins the fight!");
        else if(F1.health<=0 && F2.health<=0) System.out.println("It's a draw!");

    }


}
