package clean.code.design_patterns.requirements.Template;
import java.util.Scanner;

public class Triangle extends GeometricFigure{
    float length1, length2, length3;

    @Override
    void changeLength(float length) {
        System.out.println("What side do you want to change?(number) ");
        Scanner keyboard = new Scanner(System.in);
        int number = keyboard.nextInt();
     switch (number){
         case(1):
             length1 = length;
                break;
         case(2):
             length2 = length;
             break;
         case(3):
             length3 = length;
             break;
     }
    }

    @Override
    void changeWidth(float width) {
    }

    @Override
    float calculatePerimeter() {
        float perimeter = length1 + length2 + length3;
        return perimeter;
    }
    float calculateSemiperimeter(){
        float semiperimeter = calculatePerimeter() / 2;
        return semiperimeter;
    }

    public Triangle(float length1, float length2, float length3) {
        this.length1 = length1;
        this.length2 = length2;
        this.length3 = length3;
    }

    //because we know all the sides of triangles, we can use heron formula to calculate the area
    @Override
    float calculateArea() {
        double heron = (calculateSemiperimeter() - length1) * (calculateSemiperimeter() - length2) *(calculateSemiperimeter() - length3);
        double area = Math.sqrt(heron);
        return (float)area;
    }
}
