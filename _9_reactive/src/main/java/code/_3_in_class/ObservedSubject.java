package code._3_in_class;

public interface ObservedSubject {

    void register(Observer o);
    void unregister(Observer o);
    void notifyObervers(String msg);


}
