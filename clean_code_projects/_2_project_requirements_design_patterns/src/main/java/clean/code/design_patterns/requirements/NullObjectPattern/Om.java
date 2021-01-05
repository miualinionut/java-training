package clean.code.design_patterns.requirements.NullObjectPattern;

public class Om  extends  OmAbstract{

    public Om(String name) {
        this.name= name;
    }


    @Override
    public String getName() {
        return name;
    }
}
