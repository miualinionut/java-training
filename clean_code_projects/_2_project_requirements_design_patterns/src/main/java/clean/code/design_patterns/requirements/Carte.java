package clean.code.design_patterns.requirements;
import java.util.*;
//obiect contruit cu ajutorul unui builder; campul vol e optional
public class Carte {
    private static int id;
    private String nume;
    private String autor;
    private Date termen;
    private int status;//0 daca e imprumutata, 1 daca e valabila
    private int vol;//volum - camp optional
    public Carte(BuilderCarte b){
        nume=b.nume;
        autor=b.autor;
        termen=b.termen;
        status=b.status;
        id=b.id;
    }
    public String getNume() {
        return nume;
    }

    public String getAutor() {
        return autor;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    public void afis(){
        System.out.println(id+" "+autor + " " + nume);
        if(vol!=0) System.out.print(" "+ vol);
    }
    public void setTermen(Date termen) {
        this.termen = termen;
    }

    //clasa builder
    public static class BuilderCarte {
        private static int id;
        private String nume;
        private String autor;
        private Date termen;
        private int status;
        private int vol;
        public BuilderCarte(String n,String a){
            this.nume=n;
            this.autor=a;
            this.id++;
            this.status=1;
            this.vol=0;
        }
        public BuilderCarte setVolum(int v){
            this.vol=v;
            return this;
        }
        public Carte build(){
            return new Carte(this);
        }
    }
}

