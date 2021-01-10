package com.company;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        printMenu();
    }


    public static void printMenu() throws NumberFormatException, IOException {
        Scanner s = new Scanner(System.in);
        boolean check = true;
        while(check){
            System.out.println("==========Food Menu==========");
            System.out.println("\t1.Appetizer");
            System.out.println("\t2.ItalianFood");
            System.out.println("\t3.SpanishFood");
            System.out.println("\t4.Exit");
            System.out.println("Enter your choice: ");
            int choice = s.nextInt();
            switch (choice){
                case 1: {
                    Appetizer appetizer = new Appetizer();
                    System.out.println(appetizer.prepareFood());
                    System.out.println(appetizer.foodPrice());
                    break;
                }
                case 2: {
                    Food food = new ItalianFood(new Appetizer());
                    System.out.println(food.prepareFood());
                    System.out.println(food.foodPrice());
                    break;
                }
                case 3: {
                    Food food1 = new SpanishFood(new Appetizer());
                    System.out.println(food1.prepareFood());
                    System.out.println(food1.foodPrice());
                    break;
                }
                case 4: {
                    check = false;
                }
            }
        }
    }
}
