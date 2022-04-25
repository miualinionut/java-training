package clean.code.design_patterns.requirements;

public class CreditCard {
    private String typeOfCard; //required
    private String cardNumber;//required
    private int balance;//required
    private String pin; //required
    private String receipt;//optional

    private CreditCard(Builder builder) {
        this.typeOfCard = builder.typeOfCard;
        this.cardNumber = builder.cardNumber;
        this.balance = builder.balance;
        this.receipt=builder.receipt;
        this.pin = builder.pin;
    }

    public String getTypeOfCard() {
        return typeOfCard;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public int getBalance() {
        return balance;
    }

    public String getReceipt() {
        return receipt;
    }

    public String getPin() {return pin;}

    public static class Builder {
        private final String typeOfCard;
        private String cardNumber;
        private int balance;
        private String receipt;
        private String pin;

        public Builder (String typeOfCard, String pin) {
            this.typeOfCard = typeOfCard;
            this.pin = pin;

        }

        public Builder setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public Builder setBalance(int balance) {
            this.balance = balance;
            return this;
        }

        public Builder printReceipt(String receipt) {
            this.receipt = receipt;
            return this;
        }
        public CreditCard build() {
            return new CreditCard(this);
        }

    }
    public void withdrawFromCard(int amount){
        if (this.balance > amount){
            this.balance -= amount;
            System.out.println(amount + Bill.currency);
        }else {
            System.out.println("Insufficient funds");
        }
    }
    public int depositToCard(int amount){
        balance += amount;
        return balance;
    }
}
