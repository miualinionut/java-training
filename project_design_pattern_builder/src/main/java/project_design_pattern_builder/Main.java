package project_design_pattern_builder;

public class Main {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount.Builder(12345)
                .withOwner("David")
                .atBranch("Springfield")
                .openingBalance(100)
                .atRate(2.5)
                .build();

        BankAccount account2 = new BankAccount.Builder(45678)
                .withOwner("Sebastian")
                //no branch
                .openingBalance(200)
                .atRate(5)
                .build();

        BankAccount account3 = new BankAccount.Builder(45678)
                //no owner
                //no branch
                //no balance
                //no interestRate
                .build();

        System.out.println(account1);
        System.out.println(account2);
        System.out.println(account3);
    }
}
