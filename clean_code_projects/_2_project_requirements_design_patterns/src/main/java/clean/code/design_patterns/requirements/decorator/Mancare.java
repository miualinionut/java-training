package clean.code.design_patterns.requirements.decorator;

public abstract class Mancare {
    private int cost;
    private String descriere;

    public Mancare(int cost, String descriere) {
        this.cost = cost;
        this.descriere = descriere;
    }

    int getPret() {
        return cost;
    }

    String getDescriere() {
        return descriere;
    }
}
