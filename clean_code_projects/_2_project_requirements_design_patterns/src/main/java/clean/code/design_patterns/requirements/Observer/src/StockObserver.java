package clean.code.design_patterns.requirements.Observer.src;// Represents each Observer that is monitoring changes in the subject

public class StockObserver implements Observer {

    private double ibmPrice;
    private double aaplPrice;
    private double googPrice;

    private static int observerIDTracker = 0;
    private int observerID;
    private Subject stockGrabber;

    public StockObserver(Subject stockGrabber){
        // Store the reference to the stockGrabber object so
        // I can make calls to its methods
        this.stockGrabber = stockGrabber;
        this.observerID = ++observerIDTracker;
        System.out.println("New Observer " + this.observerID);
        stockGrabber.register(this);

    }

    // Called to update all observers
    public void update(double ibmPrice, double aaplPrice, double googPrice) {

        this.ibmPrice = ibmPrice;
        this.aaplPrice = aaplPrice;
        this.googPrice = googPrice;

        printThePrices();

    }

    public void printThePrices(){

        System.out.println(observerID + "\nIBM: " + ibmPrice + "\nAAPL: " +
                aaplPrice + "\nGOOG: " + googPrice + "\n");

    }

}