package clean.code.design_patterns.requirements.CompositePattern;

import java.util.ArrayList;
import java.util.List;

public class Angajat {
    private String nume;
    private String departament;
    private List<Angajat> subordonat;

    public Angajat(String nume, String departament) {
        this.nume = nume;
        this.departament = departament;
        subordonat = new ArrayList<Angajat>() ;

    }

    public void adaugaSubsubordonat( Angajat sub){
        subordonat.add(sub);
    }

    public List<Angajat> getSubordonat(){
        return subordonat;
    }

    @Override
    public String toString() {
        return "Angajat{" +
                "nume='" + nume + '\'' +
                ", departament='" + departament +
                '}';
    }
}
