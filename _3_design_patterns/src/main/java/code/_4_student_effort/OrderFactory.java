package code._4_student_effort;

public class OrderFactory {
    public Order createOrder(String type) {
        if(type.equalsIgnoreCase("food")) {
            return new FoodOrder();
        }
        else if(type.equalsIgnoreCase("drink")) {
            return new DrinkOrder();
        }
        else if(type.equalsIgnoreCase("dessert")) {
            return new DessertOrder();
        }
        else {
            return null;
        }
    }
}
