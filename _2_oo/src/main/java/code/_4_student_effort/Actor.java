package code._4_student_effort;

public class Actor {
    private String nume;
    private int varsta;
    private Premiu[] premii;
    public Actor(String n,int v, Premiu[] p){
        nume=n;
        varsta=v;
        premii=p;
    }
    public String getNume(){
        return nume;
    }

    public int getVarsta() {
        return varsta;
    }
}
