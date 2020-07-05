package clean.code.design_patterns.requirements;

public class Zahar extends IngredientClient {
    public Zahar(Cafea cafea) {
        super("Zahar", cafea);
    }


    @Override
    public String getDescriere() {
        return cafea.getDescriere() + " cu mai mult zahar ";
    }

    @Override
    public double getCost() {
        return cafea.getCost() + 5;
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Zahar{}";
    }
}
