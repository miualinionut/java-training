package clean.code.design_patterns.requirements;

public class AListCelebrity extends Candidate{
    private String name;

    public AListCelebrity(String name) {
        this.name = name;
        System.out.println(name + " will be lifted by the limo and will have access to the VIP corner.");
    }

    public String getName() {
        return name;
    }
}
