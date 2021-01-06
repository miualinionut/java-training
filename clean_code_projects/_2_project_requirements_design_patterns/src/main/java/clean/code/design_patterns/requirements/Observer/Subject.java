package clean.code.design_patterns.requirements.Observer;

public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers(String message);
}
