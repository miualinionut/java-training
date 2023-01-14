package clean.code.design_patterns.requirements.AbstractFactory;

public class Cartof implements Leguma {
    @Override
    public String getLeguma() {
        return "Cartof";
    }

    @Override
    public Integer getCantitate() {
        return 200;
    }

    @Override
    public Double getPret() {
        return 800.6;
    }
}
