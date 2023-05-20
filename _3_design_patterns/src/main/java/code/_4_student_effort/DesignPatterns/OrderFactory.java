package code._4_student_effort.DesignPatterns;

import code._4_student_effort.DesignPatterns.DessertOrder;
import code._4_student_effort.DesignPatterns.DrinkOrder;
import code._4_student_effort.DesignPatterns.FoodOrder;
import code._4_student_effort.DesignPatterns.Order;

public class OrderFactory {
    public OrderFactory() {
    }

    public Order createOrder(String type) {
        if (type.equalsIgnoreCase("food")) {
            return new FoodOrder();
        } else if (type.equalsIgnoreCase("drink")) {
            return new DrinkOrder();
        } else {
            return type.equalsIgnoreCase("dessert") ? new DessertOrder() : null;
        }
    }
}
