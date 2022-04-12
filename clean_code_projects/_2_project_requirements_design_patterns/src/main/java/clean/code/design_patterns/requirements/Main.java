package clean.code.design_patterns.requirements;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//Design patterns used: factory & strategy

public class Main {

    public void pay(PaymentStrategy strategy, Double price){
        strategy.makePayment(price);
    }

    public void giveChange(PaymentStrategy strategy, Double price, Double pay){
        strategy.change(price, pay);
    }

    public static void main(String[] args) throws IOException {
        CoffeeFactory factory = new CoffeeFactory();

        System.out.print("Enter the name of the coffee you want: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String coffeeName = br.readLine();
        Coffee p = factory.getCoffee(coffeeName);
        try{
            p.prepareCoffe();
            System.out.print("Coffe quantity: ");
            System.out.println(p.getCoffeeQuantity() + " ml");
            System.out.print("Milk quantity: ");
            System.out.println(p.getMilkQuantity() + " ml");
            System.out.print("Toppings: ");
            System.out.println(p.getToppings());
            System.out.print("You have to pay: ");
            System.out.println(p.price());

            System.out.print("Which way would you like to pay? Cash or card? ");
            String paymentMethod = br.readLine();
            String pay;
            Main payment = new Main();

            if(paymentMethod.equals("card")){
                payment.pay(new Card(), p.price());
            }
            else if (paymentMethod.equals("cash")){
                System.out.println("How much do you pay?");
                pay = br.readLine();
                payment.pay(new Cash(), p.price());
                payment.giveChange(new Cash(), p.price(), Double.valueOf(pay));
            }
        } catch (Exception ex){
            System.out.println("Invalid coffee name. Please choose one of these: CaffeLatte, Cappuccino, CaramelMacchiato, Frappe");
        }
        
    }

}
