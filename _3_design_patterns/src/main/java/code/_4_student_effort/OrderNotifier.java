package code._4_student_effort;

public class OrderNotifier implements Observable {
    public void addOrder(Order order) {
        setChanged();
        notifyObservers(order);
    }

    private void notifyObservers(Order order) {
    }

    private void setChanged() {
        
    }

    @Override
    public void observe() {

    }
}
