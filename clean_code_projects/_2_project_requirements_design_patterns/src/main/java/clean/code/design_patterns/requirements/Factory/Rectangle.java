package clean.code.design_patterns.requirements.Factory;

public class Rectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw a rectangle.");
    }
}
