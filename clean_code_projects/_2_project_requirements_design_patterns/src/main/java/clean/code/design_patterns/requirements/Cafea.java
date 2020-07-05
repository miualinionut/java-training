package clean.code.design_patterns.requirements;

public abstract class Cafea {

    private String descriere;

    public Cafea(String descriere) {
        super();
        this.descriere = descriere;
    }

    public String getDescriere() {
        return descriere;
    }

    public abstract double getCost();

    @Override
    public String toString() {
        return "Cafea{" +
                "descriereCafea='" + descriere + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cafea cafea = (Cafea) o;

        return descriere != null ? descriere.equals(cafea.descriere) : cafea.descriere == null;
    }

    @Override
    public int hashCode() {
        return descriere != null ? descriere.hashCode() : 0;
    }
}

