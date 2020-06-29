package code._4_student_effort;

import code._2_challenge._6_builder.Person;

public class BankAccount {

    private long accountNumber;
    private String owner;
    private String branch;
    private double balance;
    private double interestRate;


    public BankAccount(BankAccount.Builder builder) {
        this.accountNumber = builder.accountNumber;
        this.owner = builder.owner;
        this.branch = builder.branch;
        this.balance = builder.balance;
        this.interestRate = builder.interestRate;
    }

    public static class Builder {
        private long accountNumber;
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
       // public BankAccount build() {

         //   BankAccount account = new BankAccount();
           // account.accountNumber = this.accountNumber;
            //account.owner = this.owner;
           // account.branch = this.branch;
            //account.balance = this.balance;
            //account.interestRate = this.interestRate;
            //return account;
        //}
    }
}
