package clean.code.design_patterns.requirements.Factory;

public class Rosie implements Leguma {
    @Override
    public void getLeguma() {
        System.out.println("Rosie");
    }

    @Override
    public void getCantitate() {
        System.out.println("100 tone");
    }

    @Override
    public void getPret() {
        System.out.println ("900.6 lei/tona");
    }
}
