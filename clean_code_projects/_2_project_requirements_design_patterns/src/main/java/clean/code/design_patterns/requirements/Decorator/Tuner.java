package clean.code.design_patterns.requirements.Decorator;

public abstract class Tuner implements MasinaTunata {
    private MasinaTunata masina;

    public Tuner(MasinaTunata masina) {
        this.masina = masina;
    }

    @Override
    public String Tuneaza() {
        return masina.Tuneaza();
    }
}
