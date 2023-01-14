package clean.code.design_patterns.requirements.AbstractFactory;

public class Grau implements Cereala {
    @Override
    public String getCereala() {
        return "Grau";
    }

    @Override
    public Integer getCantitate() {
        return 220;
    }

    @Override
    public Double getPret() {
        return 600.5;
    }
}
