package code._4_student_effort;

public class StockMonitor implements StockDataObserver {
    private String name;

    public StockMonitor(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(name + " received an update for " + stockName + ": $" + price);
    }
}
