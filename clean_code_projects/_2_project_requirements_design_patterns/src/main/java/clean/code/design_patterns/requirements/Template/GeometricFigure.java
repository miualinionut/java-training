package clean.code.design_patterns.requirements.Template;


public abstract class GeometricFigure {

    abstract void changeLength(float length);
    abstract void changeWidth(float width);
    abstract float calculatePerimeter();
    abstract float calculateArea();
    public final void displayPerimeter(){
        System.out.println("The perimeter is: " + calculatePerimeter());
    }
    public final void displayArea(){
        System.out.println("The area is: " + calculateArea());
    }
}
