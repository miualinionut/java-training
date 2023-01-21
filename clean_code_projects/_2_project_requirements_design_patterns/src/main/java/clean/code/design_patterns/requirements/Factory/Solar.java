package clean.code.design_patterns.requirements.Factory;

public class Solar {

    public Leguma getLeguma(String numeLeguma) {
        if (numeLeguma == null) {
            return null;
        }
        if (numeLeguma.equalsIgnoreCase("Rosie")) {
            return new Rosie();

        } else if (numeLeguma.equalsIgnoreCase("Cartof")) {
            return new Cartof();
        }
        return null;
    }
}
