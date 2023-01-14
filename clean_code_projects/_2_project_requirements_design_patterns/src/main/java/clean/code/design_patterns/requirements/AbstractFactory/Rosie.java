package clean.code.design_patterns.requirements.AbstractFactory;

public class Rosie implements Leguma {
    @Override
    public String getLeguma() {
        return "Rosie";
    }

    @Override
    public Integer getCantitate() {
        return 120;
    }

    @Override
    public Double getPret() {
        return 1200.3;
    }
}
