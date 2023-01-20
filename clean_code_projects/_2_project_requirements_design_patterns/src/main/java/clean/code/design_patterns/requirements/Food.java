package clean.code.design_patterns.requirements;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

interface Meal{
    Meal clone();
}

class Spaghetti implements Meal{
    private String type;
    public Spaghetti(String type){
        this.type = type;
    }
    public String getType(){
        return type;
    }

    public Meal clone(){
        return new Spaghetti(this.type);
    }
    public String toString(){
        return "Spaghetti with " + type + " sauce";
    }
}

class ChickenSoup implements Meal{
    private String vegetable;
    public ChickenSoup(String vegetable){
        this.vegetable = vegetable;
    }
    public String getVegetable(){
        return vegetable;
    }

    public Meal clone(){
        return new ChickenSoup(this.vegetable);
    }
    public String toString(){
        return "Chicken soup with " + vegetable;
    }
}

class Salad implements Meal{
    private String dressing;
    public Salad(String dressing){
        this.dressing = dressing;
    }
    public String getDressing(){
        return dressing;
    }

    public Meal clone(){
        return new Salad(this.dressing);
    }
    public String toString() {
        return "Salad with " + dressing + " dressing";
    }
}


class Dish{

    public static void main(String[] args) {

        Meal spaghetti = new Spaghetti("tomato");
        Meal chickenSoup = new ChickenSoup("carrot");
        Meal salad = new Salad("vinaigrette");

        System.out.println("Choose dish: Spaghetti, Chicken soup, Salad");
        Scanner myInput = new Scanner(System.in);
        String mealName = myInput.nextLine();

        if (mealName.equalsIgnoreCase("Spaghetti")){
            Meal spaghetti1 = new Spaghetti("Alfredo");
            Meal spaghetti2 = new Spaghetti("Marinara");
            Meal spaghetti3 = new Spaghetti("Bolognese");
            Meal spaghetti4 = new Spaghetti("Pomodoro");
            Meal spaghetti5 = new Spaghetti("Pesto");
            Meal spaghetti6 = new Spaghetti("Carbonara");
            Meal spaghetti7 = new Spaghetti("Bechamel");

            System.out.println("\nWe have:\n");
            Meal spaghettiClone1 = spaghetti1.clone();
            System.out.println(spaghettiClone1.toString());
            Meal spaghettiClone2 = spaghetti2.clone();
            System.out.println(spaghettiClone2.toString());
            Meal spaghettiClone3 = spaghetti3.clone();
            System.out.println(spaghettiClone3.toString());
            Meal spaghettiClone4 = spaghetti4.clone();
            System.out.println(spaghettiClone4.toString());
            Meal spaghettiClone5 = spaghetti5.clone();
            System.out.println(spaghettiClone5.toString());
            Meal spaghettiClone6 = spaghetti6.clone();
            System.out.println(spaghettiClone6.toString());
            Meal spaghettiClone7 = spaghetti7.clone();
            System.out.println(spaghettiClone7.toString());

        }
        else if(mealName.equalsIgnoreCase(("Chicken soup"))){
            Meal chickenSoup1 = new ChickenSoup("carrot");
            Meal chickenSoup2 = new ChickenSoup("pasta");
            Meal chickenSoup3 = new ChickenSoup("butternut squash");
            Meal chickenSoup4 = new ChickenSoup("beans");
            Meal chickenSoup5 = new ChickenSoup("leeks");
            Meal chickenSoup6 = new ChickenSoup("peas");
            Meal chickenSoup7 = new ChickenSoup("ham");
            Meal chickenSoup8 = new ChickenSoup("bacon");

            System.out.println("\nWe have:\n");
            Meal chickenSoupClone1 = chickenSoup1.clone();
            System.out.println(chickenSoupClone1.toString());
            Meal chickenSoupClone2 = chickenSoup2.clone();
            System.out.println(chickenSoupClone2.toString());
            Meal chickenSoupClone3 = chickenSoup3.clone();
            System.out.println(chickenSoupClone3.toString());
            Meal chickenSoupClone4 = chickenSoup4.clone();
            System.out.println(chickenSoupClone4.toString());
            Meal chickenSoupClone5 = chickenSoup5.clone();
            System.out.println(chickenSoupClone5.toString());
            Meal chickenSoupClone6 = chickenSoup6.clone();
            System.out.println(chickenSoupClone6.toString());
            Meal chickenSoupClone7 = chickenSoup7.clone();
            System.out.println(chickenSoupClone7.toString());
            Meal chickenSoupClone8 = chickenSoup8.clone();
            System.out.println(chickenSoupClone8.toString());


        }
        else if(mealName.equalsIgnoreCase("Salad")){
            Meal salad1 = new Salad("french");
            Meal salad2 = new Salad("honey & mustard");
            Meal salad3 = new Salad("sesame & soy");
            Meal salad4 = new Salad("sherry & soy");
            Meal salad5 = new Salad("parsley");
            Meal salad6 = new Salad("caper & anchovy");
            Meal salad7 = new Salad("ginger & wasabi");
            Meal salad8 = new Salad("tahini");


            System.out.println("\nWe have:\n");
            Meal saladClone1 = salad1.clone();
            System.out.println(saladClone1.toString());
            Meal saladClone2 = salad2.clone();
            System.out.println(saladClone2.toString());
            Meal saladClone3 = salad3.clone();
            System.out.println(saladClone3.toString());
            Meal saladClone4 = salad4.clone();
            System.out.println(saladClone4.toString());
            Meal saladClone5 = salad5.clone();
            System.out.println(saladClone5.toString());
            Meal saladClone6 = salad6.clone();
            System.out.println(saladClone6.toString());
            Meal saladClone7 = salad7.clone();
            System.out.println(saladClone7.toString());
            Meal saladClone8 = salad8.clone();
            System.out.println(saladClone8.toString());
        }
        else System.out.println("We don't have that dish!");
    }
}