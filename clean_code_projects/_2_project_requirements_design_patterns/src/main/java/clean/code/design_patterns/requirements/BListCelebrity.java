package clean.code.design_patterns.requirements;

public class BListCelebrity extends Candidate{
    private String name;

    public BListCelebrity(String name) {
        this.name = name;
        System.out.println(name + " will have access to the VIP corner.");
    }

    public String getName() {
        return name;
    }
}
