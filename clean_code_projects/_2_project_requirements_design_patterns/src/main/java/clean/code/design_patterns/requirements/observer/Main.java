package clean.code.design_patterns.requirements.observer;

// Usage example
    public class Main {
    public static void main(String[] args) {
        // Create subject
        StockMarket stockMarket = new StockMarket();

        // Create observers
        Observer client1 = new StockClient("Client 1");
        Observer client2 = new StockClient("Client 2");
        Observer client3 = new StockClient("Client 3");

        // Register observers
        stockMarket.registerObserver(client1);
        stockMarket.registerObserver(client2);
        stockMarket.registerObserver(client3);

        // Set stock data, which will notify the observers
        stockMarket.setStockData("ABC", 100.0);
        stockMarket.setStockData("XYZ", 150.0);

        // Unregister observer
        stockMarket.unregisterObserver(client2);

        // Set stock data again, only client1 and client3 will be notified
        stockMarket.setStockData("DEF", 200.0);
    }
}
