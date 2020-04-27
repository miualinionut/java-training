package code._4_student_effort;

public class BoxMatch {
    private Fighterz a,b;
    public BoxMatch(int ah,int aa,String an, int bh,int ba,String bn){
        a=new Fighterz(ah,aa,an);
        b=new Fighterz(bh,ba,bn);
    }
    public String Fight(){
        while(a.getHealth()>0 && b.getHealth()>0){
            a.atk(b);
            b.atk(a);
        }
        if(a.getHealth()<=0)return b.getName();
        else return a.getName();
    }
}
