package clean.code.design_patterns.requirements.Factory;

public class ShapeFactory {
    public Shape createShape(ShapeType shapeType){
        switch(shapeType){
            case CIRCLE:
                return new Circle();
            case RECTANGLE:
                return new Rectangle();
            case SQUARE:
                return new Rectangle();
            default:
                return null;
        }
    }
}
