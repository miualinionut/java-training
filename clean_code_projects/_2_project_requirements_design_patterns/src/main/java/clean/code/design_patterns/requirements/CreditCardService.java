public class CreditCardService extends Payment {
    private String card;

    public CreditCardService(String card) {
        super();
        this.card = card;
    }

    @Override
    public void pay() {
        System.out.println("Paying with " + card + " card...");
        sendMail(card);
    }
}
