package code._4_student_effort;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StockMarketData stockMarketData = StockMarketData.getInstance();

        // Create stock monitors
        StockMonitor monitor1 = new StockMonitor("Monitor 1");
        StockMonitor monitor2 = new StockMonitor("Monitor 2");

        // Register monitors as observers
        stockMarketData.registerObserver(monitor1);
        stockMarketData.registerObserver(monitor2);

        // Add stocks to the stock market
        Stock stock1 = new Stock("ABC", 100.0);
        Stock stock2 = new Stock("XYZ", 50.0);
        stockMarketData.addStock(stock1);
        stockMarketData.addStock(stock2);

        // Simulate stock price updates
        stockMarketData.updateStockPrice("ABC", 105.0);
        stockMarketData.updateStockPrice("XYZ", 55.0);
    }
}