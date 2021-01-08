package cards;

import java.util.Random;

public class CardING extends Card {

    private final int number;
    private String password;
    private double funds;
    private final String bankName;
    private String ownerName;

    public CardING(String ownerName, String password) {

        this.number = 100000 + new Random().nextInt(900000);
        this.password = "1234";
        this.funds = 10.00;
        this.bankName = "ING";
        this.ownerName = ownerName;
    }

    public int getNumber() {
        return number;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public String getBankName() {
        return bankName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "Card{" +
                "ownerName=" + ownerName +
                ", bankName=" + bankName +
                ", funds=" + funds +
                ", cardNumber='" + number + '\'' +
                ", PIN='" + password + '\'' +
                '}';
    }
}
