package clean.code.design_patterns.requirements;

public class QuickRefill implements IRefill {
    @Override
    public void refill() {
        System.out.println("This type of refill happens quickly!");
    }
}
