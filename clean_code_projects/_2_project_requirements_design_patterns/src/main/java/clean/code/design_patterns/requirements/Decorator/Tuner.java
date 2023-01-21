package clean.code.design_patterns.requirements.Decorator;

public class Tuner implements MasinaStock {
    protected MasinaStock masina;

    public Tuner(MasinaStock m) {
        this.masina = m;
    }

    @Override
    public void Tuneaza() {
        this.masina.Tuneaza();
    }
}
