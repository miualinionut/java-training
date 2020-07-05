package clean.code.design_patterns.requirements;

public class CafeaAmericano extends Cafea{

    public CafeaAmericano() {
        super("cafeaAmericano");
    }

    @Override
    public double getCost() {
        return 40;
    }

    @Override
    public String toString() {
        return "CafeaAmericano{}";
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
