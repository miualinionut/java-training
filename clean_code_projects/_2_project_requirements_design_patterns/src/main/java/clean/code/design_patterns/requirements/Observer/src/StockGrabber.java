package clean.code.design_patterns.requirements.Observer.src;

import java.util.ArrayList;

// Uses the Subject interface to update all Observers
public class StockGrabber implements Subject{

    private ArrayList<Observer> observers;
    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    public StockGrabber(){
        observers = new ArrayList<Observer>();
    }

    public void register(Observer newObserver) {
        observers.add(newObserver);

    }

    public void unregister(Observer deleteObserver) {
        int observerIndex = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (observerIndex+1) + " deleted");
        observers.remove(observerIndex);

    }

    public void notifyObserver() {

        // Cycle through all observers and notifies them of
        // price changes
        for(Observer observer : observers){
            observer.update(ibmPrice, aaplPrice, googPrice);
        }
    }

    // Change prices for all stocks and notifies observers of changes
    public void setIBMPrice(double newIBMPrice){
        this.ibmPrice = newIBMPrice;
        notifyObserver();

    }

    public void setAAPLPrice(double newAAPLPrice){

        this.aaplPrice = newAAPLPrice;

        notifyObserver();

    }

    public void setGOOGPrice(double newGOOGPrice){

        this.googPrice = newGOOGPrice;

        notifyObserver();

    }

}