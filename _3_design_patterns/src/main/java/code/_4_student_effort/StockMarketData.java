package code._4_student_effort;

import java.util.ArrayList;
import java.util.List;
public class StockMarketData {
    private List<StockDataObserver> observers;
    private static StockMarketData instance;
    private List<Stock> stocks;

    private StockMarketData() {
        observers = new ArrayList<>();
        stocks = new ArrayList<>();
    }

    public static StockMarketData getInstance() {
        if (instance == null) {
            instance = new StockMarketData();
        }
        return instance;
    }

    public void registerObserver(StockDataObserver observer) {
        observers.add(observer);
    }

    public void removeObserver(StockDataObserver observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String stockName, double price) {
        for (StockDataObserver observer : observers) {
            observer.update(stockName, price);
        }
    }

    public void addStock(Stock stock) {
        stocks.add(stock);
    }

    public void updateStockPrice(String stockName, double price) {
        for (Stock stock : stocks) {
            if (stock.getName().equalsIgnoreCase(stockName)) {
                stock.setPrice(price);
                notifyObservers(stockName, price);
                break;
            }
        }
    }
}
