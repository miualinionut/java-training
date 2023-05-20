package clean.code.design_patterns.requirements;

public class Shrinking implements Trend {
    String name = "shrinking";
    public float loss_function() {
        return -0.2F;
    }
}
