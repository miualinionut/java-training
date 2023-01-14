package clean.code.design_patterns.requirements.Decorator;

public class Spoiler extends Tuner {
    public Spoiler(MasinaTunata masina) {
        super(masina);
    }

    public String Tuneaza() {
        return super.Tuneaza() + adaugaSpoiler();
    }

    private String adaugaSpoiler() {
        return "cu Spoiler";
    }
}
