package clean.code.design_patterns.requirements;

public class VAN implements MasiniMari {
    private int id;
    private String nume;

    public VAN(int id, String nume) {
        this.id = id;
        this.nume = nume;
    }

    public void printNumeMasina() {
        System.out.println(id + " " + nume);
    }
}