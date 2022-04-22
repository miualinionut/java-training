package clean.code.design_patterns.requirements.Template;

import clean.code.design_patterns.requirements.Template.Base;

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class ComplexNumbers extends Base {
    int realPart1;
    int realPart2;
    int imaginaryPart1;
    int imaginaryPart2;

    @Override
    void initialize() {
        Random rand =  new Random();
        int upperbound  = 50;
        this.realPart1 =  rand.nextInt(upperbound);
        this.imaginaryPart1 = rand.nextInt(upperbound);
        this.realPart2 =  rand.nextInt(upperbound);
        this.imaginaryPart2 = rand.nextInt(upperbound);
        System.out.println("The complex numbers you're calculating with are: " + this.realPart1 + " + " + this.imaginaryPart1 + "i and " + this.realPart2 + " + " + this.imaginaryPart2 + "i\n" );
    }

    @Override
    void absoluteValue() {
        Scanner scan = new Scanner(System.in);
        int userResult, correctResult;
        correctResult = (int) sqrt((this.realPart1)*(this.realPart1) + (this.imaginaryPart1)*(this.imaginaryPart1));
        System.out.println("Write the absolute value of the number: " + this.realPart1 + "+" + this.imaginaryPart1 + "i\n");
        userResult = Integer.parseInt(scan.nextLine());

        if(userResult == correctResult)
            System.out.println("you're right!\n");
        else {
            System.out.println("Your answer is wrong. Good luck next time!");
            System.out.println("The correct answer is: " + correctResult + "\n");
        }

    }

    @Override
    void substraction() {
        Scanner scan = new Scanner(System.in);
        int userResult1, userResult2, correctResult1, correctResult2;
        System.out.println("The result of: " + this.realPart1 + " + " + this.imaginaryPart1 + "i - " + this.realPart2 + " + " + this.imaginaryPart2 + "i = ?\n" );
        System.out.println("Write the real and the imaginary parts\n");

        userResult1 = Integer.parseInt(scan.nextLine());
        userResult2 = Integer.parseInt(scan.nextLine());

        correctResult1 = this.realPart1 - this.realPart2;
        correctResult2 = this.imaginaryPart1 - this.imaginaryPart2;

        if(userResult1 == correctResult1 && userResult2 == correctResult2)
            System.out.println("you're right!\n");
        else {
            System.out.println("Your answer is wrong. Good luck next time!");
            System.out.println("The correct answer is: " + correctResult1 + " + " + correctResult2 + "i \n");
        }


    }

    @Override
    void add() {
        Scanner scan = new Scanner(System.in);
        int userResult1, userResult2, correctResult1, correctResult2;
        System.out.println("The result of: " + this.realPart1 + " + " + this.imaginaryPart1 + "i + " + this.realPart2 + " + " + this.imaginaryPart2 + "i = ?\n" );
        System.out.println("Write the real and the imaginary parts\n");

        userResult1 = Integer.parseInt(scan.nextLine());
        userResult2 = Integer.parseInt(scan.nextLine());

        correctResult1 = this.realPart1 + this.realPart2;
        correctResult2 = this.imaginaryPart1 + this.imaginaryPart2;

        if(userResult1 == correctResult1 && userResult2 == correctResult2)
            System.out.println("you're right!\n");
        else {
            System.out.println("Your answer is wrong. Good luck next time!");
            System.out.println("The correct answer is: " + correctResult1 + " + " + correctResult2 + "i \n");
        }

    }
}
