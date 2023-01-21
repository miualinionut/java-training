package clean.code.design_patterns.requirements.Factory;

public class Cartof implements Leguma {
    @Override
    public void getLeguma() {
        System.out.println("Cartof");
    }

    @Override
    public void getCantitate() {
        System.out.println("200 tone");
    }

    @Override
    public void getPret() {
        System.out.println ("800.6 lei/tona");
    }
}
