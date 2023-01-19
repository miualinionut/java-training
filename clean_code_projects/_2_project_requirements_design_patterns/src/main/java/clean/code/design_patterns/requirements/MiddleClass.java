package clean.code.design_patterns.requirements;

public class MiddleClass extends Candidate{
    private String name;

    public MiddleClass(String name) {
        this.name = name;
        System.out.println(name + " will receive a free Photo shoot.");
    }

    public String getName() {
        return name;
    }
}
