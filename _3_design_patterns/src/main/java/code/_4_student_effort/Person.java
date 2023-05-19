package code._4_student_effort;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Person {
    public String Name;
    public Kitchen kitchen = new Kitchen();
    public List<Order> orderList = new ArrayList();

    public Person(List<Order> orders) {
        this.orderList = orders;
    }

    public void makeAnOrder() {
        Iterator var1 = this.orderList.iterator();

        while(var1.hasNext()) {
            Order order = (Order)var1.next();
            this.kitchen.notify(order);
        }

    }
}
