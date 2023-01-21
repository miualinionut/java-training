package clean.code.design_patterns.requirements.Decorator;

public class Spoiler extends Tuner {
    public Spoiler(MasinaStock m) {
        super(m);
    }

    @Override
    public void Tuneaza(){
        super.Tuneaza();
        System.out.println("Adaugam Spoiler!");
    }
}
