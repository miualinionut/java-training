package clean.code.design_patterns.requirements.Observer.src;

public class GrabStocks{

    public static void main(String[] args){

        // Create the Subject object
        // It will handle updating all observers
        // as well as deleting and adding them

        StockGrabber stockGrabber = new StockGrabber();

        // Create an Observer that will be sent updates from Subject

        StockObserver observer1 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(90);
        stockGrabber.setAAPLPrice(100);
        stockGrabber.setGOOGPrice(123);

        StockObserver observer2 = new StockObserver(stockGrabber);

        stockGrabber.setIBMPrice(90);
        stockGrabber.setAAPLPrice(100);
        stockGrabber.setGOOGPrice(123);

        // Delete one of the observers
        //stockGrabber.unregister(observer2);

        stockGrabber.setIBMPrice(90);
        stockGrabber.setAAPLPrice(100);
        stockGrabber.setGOOGPrice(123);

        // Create 3 threads using the Runnable interface
        // GetTheStock implements Runnable, so it doesn't waste
        // its one extendable class option

        Runnable getIBM = new GetTheStock(stockGrabber, 2, "IBM", 90);
        Runnable getAAPL = new GetTheStock(stockGrabber, 2, "AAPL", 100);
        Runnable getGOOG = new GetTheStock(stockGrabber, 2, "GOOG", 123);

        // Call for the code in run to execute

        new Thread(getIBM).start();
        new Thread(getAAPL).start();
        new Thread(getGOOG).start();


    }

}