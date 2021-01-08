package commands.atm;

import commands.Command;
import profile.Account;
import cards.Card;

public class Withdraw implements Command {
    private Account account;
    private int number;
    private double sum;
    private String password;

    public Withdraw(Account account, String password, String number, String sum) {
        this.account = account;
        this.number = Integer.parseInt(number);
        this.sum = Integer.parseInt(sum);
        this.password = password;
    }


    @Override
    public void execute() {

        Card currentCard = account.getCard(number);
        if (currentCard.getPassword().equals(password)) {
            if (currentCard.getFunds() >= sum) {
                currentCard.setFunds(currentCard.getFunds() - sum);
            } else {
                System.out.println("Error -> Insufficient funds");
            }
        } else {
            System.out.println("Error -> Wrong PIN, try again");
        }
    }

    @Override
    public void undo() {
        System.out.println("Error -> Sum has been already withdrawed, try to deposit");
    }
}
