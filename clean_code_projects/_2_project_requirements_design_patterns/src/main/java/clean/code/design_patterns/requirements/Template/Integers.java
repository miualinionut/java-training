package clean.code.design_patterns.requirements.Template;

import clean.code.design_patterns.requirements.Template.Base;

import java.util.*;

import static java.lang.Math.abs;

public class Integers extends Base
{
    int a;
    int b;
    @Override
    void initialize() {
       Random rand =  new Random();
       int upperbound  = 101;
       this.a = rand.nextInt(upperbound);
       this.b = rand.nextInt(upperbound);
       System.out.println("The numbers you're calculating with are: " + a + " and " + b + "\n");
    }

    @Override
    void absoluteValue() {
        Scanner scan = new Scanner(System.in);
        int userResult, correctResult;

        System.out.println("Write the absolute value of a: " + this.a + " \n");
        userResult = Integer.parseInt(scan.nextLine());
        correctResult = abs(this.a);
        if(userResult == correctResult)
            System.out.println("you're right!Now time for the last number.\n");
        else {
            System.out.println("Your answer is wrong. Good luck next time!Now time for the last number.\n");
            System.out.println("The correct answer is: " + correctResult + "\n");
        }


        System.out.println("Write the absolute value of b: "  + this.b + "\n");
        userResult = Integer.parseInt(scan.nextLine());
        correctResult = abs(this.b);
        if(userResult == correctResult)
            System.out.println("you're right!\n");
        else
        {
            System.out.println("Your answer is wrong. Good luck next time!\n");
            System.out.println("The correct answer is: " + correctResult + "\n");
        }

    }

    @Override
    void substraction() {
        System.out.println("Write the result for: " + a + " - " + b + "=?");
        Scanner scan = new Scanner(System.in);
        int userResult, correctResult;
        correctResult = this.a - this.b;
        userResult = Integer.parseInt(scan.nextLine());
        if(userResult ==correctResult)
            System.out.println("you're right!\n");
        else
        {
            System.out.println("Your answer is wrong. Good luck next time!\n");
            System.out.println("The correct answer is: " + correctResult + "\n");
        }
    }

    @Override
    void add() {
        System.out.println("Write the result for: " + a + " + " + b + "=?");
        Scanner scan = new Scanner(System.in);
        int userResult, correctResult;
        userResult = Integer.parseInt(scan.nextLine());
        correctResult = this.a + this.b;
        if(userResult == correctResult)
            System.out.println("you're right!\n");
        else {
            System.out.println("Your answer is wrong. Good luck next time!\n");
            System.out.println("The correct answer is: " + correctResult + "\n");
        }
    }
    }

