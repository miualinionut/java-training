package clean.code.design_patterns.requirements;

public interface Subject {

    public void register(Observer observer);
    public void unregister(Observer observer);
    public void notifyObserver();

}
