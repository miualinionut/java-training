package storage;

import communication.ServerMessage;
import main.Utils;

public class ServerCommunicationController extends Observer {
    ServerMessage message;

    public ServerCommunicationController(DataRepository observable) {
        this.observable = observable;
        this.observable.attach(this);
    }

    @Override
    public void update() {
        SensorData dataRecord = observable.getData().get(observable.getData().size() - 1);
        int steps = dataRecord.getStepsCount();
        long timeStamp = dataRecord.getTimestamp();
        message = new ServerMessage(steps, Utils.getClientId(), timeStamp);
        System.out.println("The server message would be: " + message);
    }

}
