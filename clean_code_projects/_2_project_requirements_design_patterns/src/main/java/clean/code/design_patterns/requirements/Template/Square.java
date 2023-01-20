package clean.code.design_patterns.requirements.Template;

public class Square extends GeometricFigure{
        float length;
        @Override
         void changeLength(float length){
            this.length = length;
        }

    public Square(float length) {
        this.length = length;
    }

    @Override
    void changeWidth(float width) {
    }

    @Override
    float calculatePerimeter() {
        float perimeter = length + length;
        return perimeter;
    }

    @Override
    float calculateArea() {
        float area = length * length;
        return area;
    }
}
