package clean.code.design_patterns.requirements;

// Builder Design Pattern


import java.util.ArrayList;
import java.util.List;

public interface Item {

    public String name();
    public PackingItem packing();
    public float price();
}

interface PackingItem {
    public String pack();
}

class WrappingItem implements PackingItem {

    @Override
    public String pack() {
        return "Wrapper";
    }
}

class Bottle implements PackingItem {

    @Override
    public String pack() {
        return "Bottle";
    }
}

abstract class Burger implements Item {

    @Override
    public PackingItem packing() {
        return new WrappingItem();
    }

    @Override
    public abstract float price();
}

abstract class ColdDrink implements Item {

    @Override
    public PackingItem packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}

class VegBurger extends Burger {

    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}

class ChickenBurger extends Burger {

    @Override
    public float price() {
        return 35.5f;
    }

    @Override
    public String name() {
        return "Chicken Burger";
    }
}

class Coke extends ColdDrink {

    @Override
    public float price() {
        return 25.5f;
    }

    @Override
    public String name() {
        return "Coke";
    }
}

class Fanta extends ColdDrink {

    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Fanta";
    }
}



class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item){
        items.add(item);
    }

    public float getCost(){
        float cost = 0.0f;

        for (Item item : items) {
            cost = cost + item.price();
        }
        return cost;
    }

    public void showItems(){

        for (Item item : items) {
            System.out.print("Item : " + item.name());
            System.out.print(", Packing : " + item.packing().pack());
            System.out.println(", Price : " + item.price());
        }
    }
}

class MealBuilder {

    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Fanta());
        return meal;
    }
}

class BuilderPatternDemo {
    public static void main(String[] args) {

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());
    }
}