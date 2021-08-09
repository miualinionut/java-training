package clean.code.design_patterns2.requirements;

public class Assemble implements Workshop{

    @Override
    public void work(){
        System.out.print(" And");
        System.out.println(" Assembled.");
    }
}
