package clean.code.design_patterns.requirements.observer;
// Concrete observer class
class StockClient implements Observer {
    private String name;

    public StockClient(String name) {
        this.name = name;
    }

    @Override
    public void update(String stockName, double price) {
        System.out.println(name + " received an update for " + stockName + ": $" + price);
    }
}