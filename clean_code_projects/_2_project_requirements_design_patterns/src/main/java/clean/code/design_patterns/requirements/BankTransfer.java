public class BankTransfer extends Payment {
    private String account;
    private String bankName;
    public BankTransfer(String account,String bankName) {
        super();
        this.account = account;
        this.bankName = bankName;

    }
    @Override
    public void pay(){
        System.out.println("Processing Bank Transfer...");
        sendMail("Bank " + bankName);
    }
}
