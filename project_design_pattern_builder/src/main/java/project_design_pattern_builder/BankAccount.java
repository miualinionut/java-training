package project_design_pattern_builder;

public class BankAccount {
    private final long accountNumber; //required
    private final String owner;
    private final String branch;
    private final double balance;
    private final double interestRate;

    private BankAccount(Builder account) {
        this.accountNumber = account.accountNumber;
        this.owner = account.owner;
        this.branch = account.branch;
        this.balance = account.balance;
        this.interestRate = account.interestRate;
    }

    //Getters
    public long getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public String getBranch() {
        return branch;
    }

    public double getBalance() {
        return balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public String toString() {
        return "AccountNumber: " + this.accountNumber + "\n" +
                "Owner: " + this.owner + "\n" +
                "Branch: " + this.branch + "\n" +
                "Balance: " + this.balance + "\n" +
                "interestRate: " + this.interestRate + "\n";
    }

    static class Builder {
        private final long accountNumber;
        private String owner;
        private String branch;
        private double balance;
        private double interestRate;

        public Builder(long accountNumber) {
            this.accountNumber = accountNumber;
        }

        public Builder withOwner(String owner) {
            this.owner = owner;
            return this;
        }

        public Builder atBranch(String branch) {
            this.branch = branch;
            return this;
        }

        public Builder openingBalance(double balance) {
            this.balance = balance;
            return this;
        }

        public Builder atRate(double interestRate) {
            this.interestRate = interestRate;
            return this;
        }

        public BankAccount build() {
            return new BankAccount(this);
        }
    }
}
