package code._4_student_effort;

public class Film {
    private int anAparitie;
    private String nume;
    private Actor[] actori;
    public Film(int a, String n,Actor[] ac){
        anAparitie=a;
        nume=n;
        actori=ac;
    }
    public boolean getActor(String s){
        for (int i = 0; i < actori.length; i++) {
            if(actori[i].getNume()==s)return true;
        }
        return false;
    }

    public String getNume() {
        return nume;
    }
    public boolean varsta(){
        for (int i = 0; i < actori.length; i++) {
            if(actori[i].getVarsta()>=50)return true;
        }
        return false;
    }
}
