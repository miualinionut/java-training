package clean.code.design_patterns.requirements.Decorator;

public class Jante extends Tuner {
    public Jante(MasinaTunata masina) {
        super(masina);
    }

    public String Tuneaza() {
        return super.Tuneaza() + adaugaJante();
    }

    private String adaugaJante() {
        return "cu Jante";
    }
}
