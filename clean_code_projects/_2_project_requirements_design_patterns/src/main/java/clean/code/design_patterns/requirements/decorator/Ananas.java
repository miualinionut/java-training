package clean.code.design_patterns.requirements.decorator;

public class Ananas extends CondimenteMancare{
    public Ananas(Mancare mancare) {
        super(mancare, 100, "Ananas pentru pizza :)");
    }
}
