package code._4_student_effort;

public interface StockDataSubject {
    void registerObserver(StockDataObserver observer);
    void removeObserver(StockDataObserver observer);
    void notifyObservers(String stockName, double price);
}