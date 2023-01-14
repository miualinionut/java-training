package clean.code.design_patterns.requirements.AbstractFactory;

public class Solar implements Ferma<Leguma> {

    @Override
    public Leguma create(String leguma) {
        if ("Rosie".equalsIgnoreCase(leguma)) {
            return new Rosie();
        } else if ("Cartof".equalsIgnoreCase(leguma)) {
            return new Cartof();
        }

        return null;
    }
}
