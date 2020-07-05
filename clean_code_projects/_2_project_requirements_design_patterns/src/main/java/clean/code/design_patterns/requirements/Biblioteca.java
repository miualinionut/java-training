package clean.code.design_patterns.requirements;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
//clasa singleton
public class Biblioteca {
    private static Biblioteca b;
    public List<Carte> c;
    private Biblioteca() {
        c = new ArrayList<>();
    }
    public static Biblioteca getInstance(){
        if(b==null)
            b=new Biblioteca();
        return b;
    }
    public void addcarte(String n, String a){
        c.add(new Carte.BuilderCarte(n,a).build());
    }
    public void addcartevol(String n,String a,int v){
        c.add(new Carte.BuilderCarte(n,a).setVolum(v).build());
        System.out.println("am adaugat "+c.get(1).getNume()+" "+c.get(1).getAutor());
    }
    public Date toDate(String d) throws ParseException {
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date date = format.parse(d);
        return date;
    }

    public int imprumut(String n,String a,String t) {
        for (int i = 0; i < c.size(); i++) {
            if(c.get(i).getStatus()==1 && c.get(i).getNume().equals(n) && c.get(i).getAutor().equals(a)) {
                c.get(i).setStatus(0);
                try {
                    c.get(i).setTermen(this.toDate(t));
                } catch (Exception e) {
                    System.out.println("Data introdusa incorect!");
                }
            return 1;}
        }return 0;
    }
    public void returnare(String n,String a){
        for (int i = 0; i < c.size(); i++) {
            if(c.get(i).getNume().equals(n) && c.get(i).getAutor().equals(a)){
                c.get(i).setStatus(1);
                c.get(i).setTermen(null);
            }
        }
    }
    //lista de carti scrise de un autor valabile

    public void searcha(String a){
        for (int i = 0; i < c.size(); i++) {
            if(c.get(i).getAutor().equals(a) && c.get(i).getStatus()==1){
                c.get(i).afis();
            }
        }
    }

    //lista de carti dupa nume valabile
    public void searchn(String n){
        for (int i = 0; i <c.size(); i++) {
            if(c.get(i).getNume().equals(n) && c.get(i).getStatus()==1){
                c.get(i).afis();
            }
        }
    }

    //volumele unei carti; o carte specifica fara volume
    public void search(String n,String a){
        for (int i = 0; i < c.size(); i++) {
            if(c.get(i).getNume().equals(n) && c.get(i).getStatus()==1 && c.get(i).getAutor().equals(a)) {
                c.get(i).afis();
            }
        }
    }
}
