package clean.code.design_patterns.requirements.CombinedDesignPatterns;


import java.util.ArrayList;
import java.util.List;

public class itemOrders {
    List<Items> items = new ArrayList<>();
    List<ItemsDrink> itemsDrink = new ArrayList<>();
    public void addItems(Items item) {
        items.add(item);
    }
    public void addItemsForDrink(ItemsDrink item){
        itemsDrink.add(item);
    }


    public float getCost() {
        float PizzaCost = 0.0f;
        float DrinkCost = 0.0f;
        for (Items item : items) {
            PizzaCost += item.getPrice();
        }
        for(ItemsDrink itemDr : itemsDrink){
            DrinkCost +=itemDr.getPrice();
        }

        return PizzaCost + DrinkCost;
    }

    public void showItems() {
        for (Items item : items) {
            System.out.println("Pizza you chosed is : " + item.getName());
            if (item.getSize() == 1 && item.getWeight() < 400) {
                System.out.println("Pizza size is Small and has " + item.getWeight() + " g " + "...you should order two:)");
            } else if (item.getSize() == 2 && item.getWeight() < 600) {
                System.out.println("Pizza is Medium and has " + item.getWeight() + " g");
            } else if (item.getSize() == 3 && item.getWeight() < 800) {
                System.out.println("Pizza is Large and has" + item.getWeight() + " g");
            } else if (item.getSize() == 1 && item.getWeight() == 400) {
                System.out.println("Pizza size is Small but contains Salami");
                System.out.println("Pizza has " + item.getWeight() + " g");
            } else if (item.getSize() == 2 && item.getWeight() == 700) {
                System.out.println("Pizza is Medium, don't order Drink! too many calories!");
                System.out.println("Pizza has " + item.getWeight() + " g");
            } else if (item.getSize() == 3 && item.getWeight() == 900) {
                System.out.println("Pizza is Large, don't order more than 1 and no drinks for you! Too many Calories");
                System.out.println("Pizza has " + item.getWeight() + " g");
            }
            System.out.println("Price is: " + item.getPrice() + " Lei");
            System.out.println("Pizza has: " + item.getCalories() + " calories!");
        }
        for(ItemsDrink itemDr : itemsDrink){
            System.out.println("Drink you chosed is : " + itemDr.getName());
            System.out.println("Drink price is : " + itemDr.getPrice());
            System.out.println("Drink has " + itemDr.getWeight() + " g");
        }
    }

}