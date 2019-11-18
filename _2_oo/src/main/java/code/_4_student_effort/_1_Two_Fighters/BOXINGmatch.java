package code._4_student_effort._1_Two_Fighters;

public class BOXINGmatch {
    private FIGHTER f1;
    private FIGHTER f2;

    public BOXINGmatch(FIGHTER f1, FIGHTER f2){
        this.f1=f1;
        this.f2=f2;
    }

    public String fight(){
        while(f1.getHeath()>0 && f2.getHeath()>0){
            f1.attack(f2);
            f2.attack(f1);
        }
        if(f1.getHeath()<=0) return f1.getName();
        else return f2.getName();
    }
    public static void main(String[] arg){
        FIGHTER f1=new FIGHTER("f1", 100, 100);
        FIGHTER f2=new FIGHTER("f2", 100, 100);
        BOXINGmatch boxinGmatch=new BOXINGmatch(f1, f2);
        System.out.println(boxinGmatch.fight());
    }
}



