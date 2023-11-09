package clean.code.design_patterns.requirements.Observer.src;

import java.text.DecimalFormat;

public class GetTheStock implements Runnable{

    // Could be used to set how many seconds to wait in Thread.sleep() below

    // private int startTime;
    private String stock;
    private double price;

    // Will hold reference to the StockGrabber object

    private Subject stockGrabber;

    public GetTheStock(Subject stockGrabber, int newStartTime, String newStock, double newPrice){

        // Store the reference to the stockGrabber object, so I can make calls to its methods
        this.stockGrabber = stockGrabber;
        stock = newStock;
        price = newPrice;

    }

    public void run(){

        for(int i = 1; i <= 20; i++){

            try{
                // Sleep for 2 seconds
                Thread.sleep(2000);
            }
            catch(InterruptedException e)
            {}

            double randNum = (Math.random() * (.06)) - .03;
            DecimalFormat df = new DecimalFormat("#.##");
            price = Double.valueOf(df.format((price + randNum)));

            if(stock == "IBM") ((StockGrabber) stockGrabber).setIBMPrice(price);
            if(stock == "AAPL") ((StockGrabber) stockGrabber).setAAPLPrice(price);
            if(stock == "GOOG") ((StockGrabber) stockGrabber).setGOOGPrice(price);

            System.out.println(stock + ": " + df.format((price + randNum)) +
                    " " + df.format(randNum));
            System.out.println();

        }
    }

}