package clean.code.design_patterns.requirements;

//waiter class
public class Waiter extends Thread {
    private String name;
    private Kitchen kitchen;

    public Waiter(String name, Kitchen kitchen){
        super();
        this.name = name;
        this.kitchen = kitchen;
    }

    //take a pizza from the kitchen class
    @Override
    public void run() {
            while(true){
                Pizza pizza = kitchen.remove();
                System.out.println(pizza.toString() + " has been taken for delivery.");
                try{
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
    }
}
