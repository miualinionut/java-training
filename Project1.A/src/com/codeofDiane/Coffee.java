package com.codeofDiane;

public class Coffee implements CoffeeMachine{
    CoffeeAdapter coffeeAdapter;

    @Override
    public void makeCoffee(String typeOfCoffee, String name) {
        if(typeOfCoffee.equalsIgnoreCase("americano")){
            System.out.println("Name:" + name);
        }else if(typeOfCoffee.equalsIgnoreCase("espresso") || typeOfCoffee.equalsIgnoreCase("cappuccino") || typeOfCoffee.equalsIgnoreCase("latte")){
            coffeeAdapter = new CoffeeAdapter(typeOfCoffee);
            coffeeAdapter.makeCoffee(typeOfCoffee, name);
        }else{
            System.out.println("Invalid type of coffee");
        }
    }
}
