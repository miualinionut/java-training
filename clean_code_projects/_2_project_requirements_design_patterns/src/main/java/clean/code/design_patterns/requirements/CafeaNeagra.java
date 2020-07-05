package clean.code.design_patterns.requirements;

public class CafeaNeagra extends Cafea {

    public CafeaNeagra() {
        super("Cafea Neagra");
    }

    @Override
    public double getCost() {
        return 50;
    }

    @Override
    public String toString() {
        return "CafeaNeagra{}";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

