package clean.code.design_patterns.requirements;


import java.util.*;

public class Cook extends Thread {
    private String name;
    private Kitchen kitchen;
    private static int id;

    //constructor
    public Cook(String name, Kitchen kitchen) {
        this.name = name;
        this.kitchen = kitchen;
    }


    //add a pizza to the kitchen class
    @Override
    public void run() {
        Random rand = new Random();
       while(true) {
           int noOfIngredients =rand.nextInt(4) + 3;
           int id1 = ++id;
           Pizza pizza = new Pizza(id1,noOfIngredients);
           kitchen.add(pizza);
           System.out.println("Pizza with id " + pizza.getId() + " having " + pizza.getNumberOfIngredients() + " ingredients was cooked");
           try {
               sleep((5 + noOfIngredients) * 2);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
    }
}
