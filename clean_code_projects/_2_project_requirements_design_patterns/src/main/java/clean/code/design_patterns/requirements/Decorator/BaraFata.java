package clean.code.design_patterns.requirements.Decorator;

public class BaraFata extends Tuner {
    public BaraFata(MasinaStock m) {
        super(m);
    }

    @Override
    public void Tuneaza() {
        super.Tuneaza();
        System.out.println("Adaugam Bara fata!");
    }
}
