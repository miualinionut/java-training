package code._3_in_class;

interface Copac {
    void infrunzestePrimavara();
}

class Frunza {
    String Culoare;
    int marime;
}

class Tree implements Copac {
    // Asta e compozitie, adica am in Tree Obiecte de tip frunze
    Frunza[] frunze;

    void fotosinteza() {
        System.out.println("Fotozinteza tree");
    }

    @Override
    public void infrunzestePrimavara() {
        System.out.println("Copacul infrunzeste");
    }
}

class Stejar extends Tree {
    void fotosinteza() {
        System.out.println("Fotozinteza Stejar");
    }
}

class Salcam extends Tree {
    void fotosinteza() {
        System.out.println("Fotozinteza Salcam");
    }
}

public class PolimorfismDinamic {

    public static void main(String[] args) {
        PolimorfismDinamic pd = new PolimorfismDinamic();

        Tree tree = new Tree();
        // This is a stejar
        Tree stejar = new Stejar();
        // This fails to compile
        // Stejar stejar1 = new Tree();
        pd.ruleazaFotosinteza(tree);
        pd.ruleazaFotosinteza(stejar);
    }

    private void ruleazaFotosinteza(Tree t) {
        t.fotosinteza();
    }
}
