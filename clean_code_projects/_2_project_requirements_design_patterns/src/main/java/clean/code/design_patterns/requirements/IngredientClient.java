package clean.code.design_patterns.requirements;

public abstract class IngredientClient extends Cafea {
    protected  Cafea cafea;

    public IngredientClient(String descriere, Cafea cafea) {
        super(descriere);
        this.cafea = cafea;
    }

    public abstract String getDescriere();

    @Override
    public String toString() {
        return "IngredientClient{" +
                "cafea=" + cafea +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        IngredientClient that = (IngredientClient) o;

        return cafea != null ? cafea.equals(that.cafea) : that.cafea == null;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (cafea != null ? cafea.hashCode() : 0);
        return result;
    }
}

