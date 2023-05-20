package code._4_student_effort.DesignPatterns;
import code._4_student_effort.DesignPatterns.Order;
import code._4_student_effort.DesignPatterns.OrderFactory;
import code._4_student_effort.DesignPatterns.Person;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public Main() {
    }

    public static void main(String[] args) {
        OrderFactory factory = new OrderFactory();
        Order foodOrder = factory.createOrder("food");
        Order drinkOrder = factory.createOrder("drink");
        Order dessertOrder = factory.createOrder("dessert");
        List<Order> orders = new ArrayList();
        orders.add(foodOrder);
        orders.add(drinkOrder);
        orders.add(dessertOrder);
        Person person = new Person(orders);
        person.makeAnOrder();
    }
}
