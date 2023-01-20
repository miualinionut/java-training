package clean.code.design_patterns.requirements.Template;

public class Rectangle extends GeometricFigure{
        float length;
        float width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }


    @Override
    void changeLength(float length) {
        this.length = length;
    }

    @Override
    void changeWidth(float width) {
        this.width = width;
    }

    @Override
    float calculatePerimeter() {
        float perimeter = length + width;
        return perimeter;
    }

    @Override
    float calculateArea() {
        float area = length * width;
        return area;
    }
}
