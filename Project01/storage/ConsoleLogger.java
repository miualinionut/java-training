package storage;

public class ConsoleLogger extends Observer {
    private SensorData dataRecord;

    public ConsoleLogger(DataRepository observable) {
        this.observable = observable;
        this.observable.attach(this);
    }

    @Override
    public void update() {
        System.out.println("The newest data received is: "
                + observable.getData().get(observable.getData().size() - 1));
    }
}
