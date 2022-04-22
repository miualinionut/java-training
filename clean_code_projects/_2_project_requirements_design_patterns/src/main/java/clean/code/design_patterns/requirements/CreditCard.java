package clean.code.design_patterns.requirements;

public class CreditCard {
    private String typeOfCard; //optional
    private String cardNumber;//required
    private int balance;//required
    private String pin;
    private String receipt;//optional

    private CreditCard(Builder builder) {
        this.typeOfCard = builder.typeOfCard;
        this.cardNumber = builder.cardNumber;
        this.balance = builder.balance;
        this.receipt=builder.receipt;
        this.pin = "1234";
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



    public static class Builder {
        private final String typeOfCard;
        private String cardNumber;
        private int balance;
        private String receipt;

        public Builder (String typeOfCard) {
            this.typeOfCard = typeOfCard;

        }

        public Builder setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }

        public Builder setBalance(int balance) {
            this.balance = balance;
            return this;
        }

        /*public Builder setPIN(int pin) {
            this.pin = pin;
            return this;
        }*/
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
            System.out.println("Insufficient founds");
        }
    }
    public int depositToCard(int amount){
        balance += amount;
        return balance;
    }
}
