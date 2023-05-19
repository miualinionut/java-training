package clean.code.design_patterns.requirements.observer;

import java.util.ArrayList;
import java.util.List;

// Concrete subject class
class StockMarket implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double price;

    public void setStockData(String stockName, double price) {
        this.stockName = stockName;
        this.price = price;
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, price);
        }
    }
}
