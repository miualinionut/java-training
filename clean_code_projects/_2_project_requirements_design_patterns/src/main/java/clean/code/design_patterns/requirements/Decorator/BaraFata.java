package clean.code.design_patterns.requirements.Decorator;

public class BaraFata extends Tuner {
    public BaraFata(MasinaTunata masina) {
        super(masina);
    }

    public String Tuneaza() {
        return super.Tuneaza() + adaugaBaraFata();
    }

    private String adaugaBaraFata() {
        return "cu BaraFata";
    }
}
