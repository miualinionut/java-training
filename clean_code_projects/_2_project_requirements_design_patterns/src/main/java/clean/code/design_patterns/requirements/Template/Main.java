package clean.code.design_patterns.requirements.Template;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Choose a geometric figure: 1-square, 2-rectangle, 3-triangle");
        Scanner keyboard = new Scanner(System.in);
        int i = keyboard.nextInt();
        switch (i){
            case(1):
                float squareLength;
                System.out.println("What is the length of the square? ");
                Scanner length1 = new Scanner(System.in);
                squareLength = length1.nextFloat();
                GeometricFigure s = new Square(squareLength);
                s.displayPerimeter();
                s.displayArea();
                break;
            case(2):
                float rectangleLength, rectangleWidth;
                System.out.println("What is the length of the rectangle? ");
                Scanner length2 = new Scanner(System.in);
                rectangleLength = length2.nextFloat();
                System.out.println("What is the width of the rectangle? ");
                Scanner width = new Scanner(System.in);
                rectangleWidth = width.nextFloat();
                GeometricFigure r = new Rectangle(rectangleLength, rectangleWidth);
                r.displayPerimeter();
                r.displayArea();
                break;
            case(3):
                float firstLength, secondLength, thirdLength;
                System.out.println("What is the first side of the triangle? ");
                Scanner first = new Scanner(System.in);
                firstLength = first.nextFloat();
                System.out.println("What is the second side of the triangle? ");
                Scanner second = new Scanner(System.in);
                secondLength = second.nextFloat();
                System.out.println("What is the third side of the triangle? ");
                Scanner third = new Scanner(System.in);
                thirdLength = third.nextFloat();
                GeometricFigure t = new Triangle(firstLength, secondLength, thirdLength);
                t.displayPerimeter();
                t.displayArea();
                break;
        }



    }
}
