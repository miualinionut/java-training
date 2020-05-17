// Factory pattern - fiecare payment service are constructori diferiti, si detaliile nu apar in clasa main si se pot adauga alte payment methods cu usurinta

public class PaymentFactory {
    public static Payment getPayment(String type) throws Exception {
        if ("credit".equals(type)) {
            return new CreditCardService("VISA");
    } else if ("bank" .equals(type)) {
        return new BankTransfer("RO BT", "ING");
    } else if ("online" .equals(type)) {
        return new OnlinePaymentService("PayPal", true);
    }
        else {
            throw new IllegalArgumentException("Invalid payment method.");
            }
        }
    }
