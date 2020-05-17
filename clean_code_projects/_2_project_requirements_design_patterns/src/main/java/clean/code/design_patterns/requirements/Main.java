import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        System.out.println("Choose payment method:");
        System.out.println("- credit");
        System.out.println("- bank");
        System.out.println("- online");
        String method = in.next();

        Payment payment = PaymentFactory.getPayment(method);
        payment.pay();
    }
}
