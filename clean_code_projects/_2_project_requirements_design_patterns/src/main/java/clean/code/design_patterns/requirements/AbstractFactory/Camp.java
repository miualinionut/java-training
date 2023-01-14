package clean.code.design_patterns.requirements.AbstractFactory;

public class Camp implements Ferma<Cereala> {

    @Override
    public Cereala create(String cereale) {
        if ("Grau".equalsIgnoreCase(cereale)) {
            return new Grau();
        } else if ("Porumb".equalsIgnoreCase(cereale)) {
            return new Porumb();
        }

        return null;
    }
}
