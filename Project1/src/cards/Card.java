package cards;

public class Card {

    private int number;
    private String password;
    private double funds;
    private String bankName;
    private String ownerName;

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

    public void setBankName(String bankName) {
        this.bankName = bankName;
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
