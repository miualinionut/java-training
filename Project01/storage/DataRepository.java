package storage;


import java.util.ArrayList;
import java.util.Observable;

/**
 * Persists sensor data. Observable, its observers are notified when data is added it to.
 */
public class DataRepository extends Observable {
    private ArrayList<SensorData> records;
    private ArrayList<Observer> observers;

    public DataRepository () {
        records = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void addData(SensorData dataRecord){
        records.add(dataRecord);
        notifyAllObservers();
    }

    public ArrayList<SensorData> getData() {
        return records;
    }
}


