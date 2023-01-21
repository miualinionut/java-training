package clean.code.design_patterns.requirements.Decorator;

public class Jante extends Tuner {
    public Jante(MasinaStock m) {
        super(m);
    }

    @Override
    public void Tuneaza() {
        super.Tuneaza();
        System.out.println("Schimbam Jante!");
    }
}
