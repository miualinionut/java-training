package clean.code.design_patterns.requirements;

public class Android implements Update{
    @Override
    public void updateCheckMessage(String OS) {
        System.out.println("Checking Android updates for your phone. Your current version is " + OS);
    }
}
