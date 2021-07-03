package com.codeofDiane;

public class CoffeeAdapter implements CoffeeMachine{
    CoffeeFilter coffeeFilter;
    public CoffeeAdapter(String typeOfCoffee){
        if(typeOfCoffee.equalsIgnoreCase("espresso")){
            coffeeFilter = new Espresso();
        }else if(typeOfCoffee.equalsIgnoreCase("cappuccino")){
            coffeeFilter = new Cappuccino();
        }else if(typeOfCoffee.equalsIgnoreCase("latte")){
            coffeeFilter = new Latte();
        }
    }

    @Override
    public void makeCoffee(String typeOfCoffee, String name) {
        if(typeOfCoffee.equalsIgnoreCase("espresso")){
            coffeeFilter.makeEspresso(name);
        }else if(typeOfCoffee.equalsIgnoreCase("cappuccino")){
            coffeeFilter.makeCappuccino(name);
        }else if(typeOfCoffee.equalsIgnoreCase("latte")){
            coffeeFilter.makeLatte(name);
        }
    }
}
