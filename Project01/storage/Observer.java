package storage;

public abstract class Observer {
    protected DataRepository observable;
    public abstract void update();
}
