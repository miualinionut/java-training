package code._3_in_class;

public interface ObserverSubject {
    void register(Observer o);
    void unregister(Observer o);
    void notifyObservers(String msg);
}
