package clean.code.design_patterns.requirements;

public class CListInfluencer extends Candidate{
    private String name;

    public CListInfluencer(String name) {
        this.name = name;
        System.out.println(name + "will receive a bottle of Bolgheri Sassicaia.");
    }

    public String getName() {
        return name;
    }
}
