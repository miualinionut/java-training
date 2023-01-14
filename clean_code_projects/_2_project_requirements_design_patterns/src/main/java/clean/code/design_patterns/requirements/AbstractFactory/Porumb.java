package clean.code.design_patterns.requirements.AbstractFactory;

public class Porumb implements Cereala {
    @Override
    public String getCereala() {
        return "Porumb";
    }

    @Override
    public Integer getCantitate() {
        return 320;
    }

    @Override
    public Double getPret() {
        return 400.9;
    }
}
