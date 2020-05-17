public class OnlinePaymentService extends Payment {
    private String serviceName;
    private Boolean isBlockChain;
    public OnlinePaymentService(String serviceName, Boolean isBlockChain) {
        super();
        this.serviceName = serviceName;
        this.isBlockChain = isBlockChain;

    }

    @Override
    public void pay() {
        System.out.println("Paying with " + serviceName +"...");
        sendMail(serviceName);
    }
}
