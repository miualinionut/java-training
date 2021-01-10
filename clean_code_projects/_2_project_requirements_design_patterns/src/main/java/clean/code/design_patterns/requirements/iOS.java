package clean.code.design_patterns.requirements;

public class iOS implements Update{
    @Override
    public void updateCheckMessage(String OS) {
        System.out.println("Checking iOS updates for your phone. Your current version is " + OS);
    }
}
