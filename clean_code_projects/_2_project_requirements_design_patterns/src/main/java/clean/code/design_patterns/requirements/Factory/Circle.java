package clean.code.design_patterns.requirements.Factory;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Draw a circle.");
    }
}
