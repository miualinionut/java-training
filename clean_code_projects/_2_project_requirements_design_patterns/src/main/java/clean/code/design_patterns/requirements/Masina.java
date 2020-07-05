package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.List;

class Masina implements MasiniMari {
    private int id;
    private String nume;

    private List<MasiniMari> FeluriMasini = new ArrayList<MasiniMari>();

    public void printNumeMasina() {
        for (MasiniMari m : FeluriMasini) {
            m.printNumeMasina();
        }

    }

    public void adaugaMasina(MasiniMari m) {
        FeluriMasini.add(m);

    }

    public void stergeMasina(MasiniMari m) {
        FeluriMasini.remove(m);
    }

}