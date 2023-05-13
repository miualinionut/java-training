package code._4_student_effort;

import code._2_challenge._4_observer.Observer;

public class KitchenStaff implements  Observable{
    public void update(Observer obs, Object obj) {
        System.out.println("Kitchen staff notified of new order");
        Order order = (Order) obj;
        order.prepare();

    }

    @Override
    public void observe() {

    }
}
