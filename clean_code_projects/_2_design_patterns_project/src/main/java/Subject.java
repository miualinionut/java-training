public interface Subject {
    public void notifyObservers();
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
}
