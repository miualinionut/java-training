package clean.code.design_patterns.requirements.decorator;

public class CondimenteMancare extends Mancare{
    protected Mancare mancare;

    public CondimenteMancare(Mancare mancare, int cost, String descriere) {
        super(cost, descriere);
        this.mancare = mancare;
    }

    @Override
    public int getPret() {
        return super.getPret() + mancare.getPret();
    }

    @Override
    public String getDescriere() {
        return super.getDescriere() + ", " + mancare.getDescriere();
    }
}
