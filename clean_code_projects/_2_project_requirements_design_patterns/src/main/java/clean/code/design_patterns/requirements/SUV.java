package clean.code.design_patterns.requirements;

public class SUV implements MasiniMari{
    private int id;
    private String nume;
    public SUV(int id, String nume)
    {
        this.id=id;
        this.nume=nume;
    }
    public void printNumeMasina()
    {
        System.out.println(id+" "+nume);
    }
}