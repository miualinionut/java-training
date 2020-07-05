package clean.code.design_patterns.requirements;

public class Lapte extends IngredientClient{

    public Lapte(Cafea cafea) {
        super("Lapte", cafea);
    }

    @Override
    public String getDescriere() {
        return cafea.getDescriere() + " cu mai mult lapte ";
    }

    @Override
    public double getCost() {
        return cafea.getCost() + 10;
    }

    @Override
    public String toString() {
        return "Lapte{" +
                "cafea=" + cafea +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}

