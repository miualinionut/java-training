package code._4_student_effort.challenge1;

public class BoxingMatch {
    Fighter f1;
    Fighter f2;
    String s;
    BoxingMatch(Fighter f,Fighter g){
        f1=f;
        f2=g;
    }
    String fight(){
        while(f1.heath<=0||f2.heath<=0){
            f1.attack(f2);
            f2.attack(f1);
        }
        if(f1.heath<=0){
            return f2.name;
        }
        else{
            return f1.name;
        }
    }

    public static void main(String[] args) {
        Fighter f1=new Fighter("fighter1",100,15);
        Fighter f2=new Fighter("fighter2",100,10);
        BoxingMatch bm=new BoxingMatch(f1,f2);
        System.out.println(bm.fight());
    }
}
