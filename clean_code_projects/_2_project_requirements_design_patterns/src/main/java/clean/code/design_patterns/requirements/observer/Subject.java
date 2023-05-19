package clean.code.design_patterns.requirements.observer;
// Subject interface
interface Subject {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
