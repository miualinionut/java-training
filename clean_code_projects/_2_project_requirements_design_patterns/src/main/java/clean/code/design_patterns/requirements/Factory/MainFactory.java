package clean.code.design_patterns.requirements.Factory;

public class MainFactory {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        Shape circle = factory.createShape(ShapeType.CIRCLE);
        circle.draw();
    }

}
