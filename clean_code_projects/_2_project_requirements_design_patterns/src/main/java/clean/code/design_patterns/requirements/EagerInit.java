package clean.code.design_patterns.requirements;

public class EagerInit {
    public String name = "John";

    private static final EagerInit instance = new EagerInit();
    private EagerInit() {}

    public static EagerInit getInstance() {
        return instance;
    }
}