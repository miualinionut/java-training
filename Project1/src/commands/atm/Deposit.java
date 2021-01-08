package commands.atm;

import commands.Command;
import profile.Account;
import cards.Card;

public class Deposit implements Command {
    private Account account;
    private int id;
    private double sum;
    private String password;

    public Deposit(Account account, String password, String id, String sum) {
        this.account = account;
        this.id = Integer.parseInt(id);
        this.sum = Integer.parseInt(sum);
        this.password = password;
    }

    @Override
    public void execute() {

        Card currentCard = account.getCard(id);
        if (currentCard.getPassword().equals(password)) {
            currentCard.setFunds(currentCard.getFunds() + sum);
        } else {
            System.out.println("Error -> Wrong pin, try again");
        }
    }

    @Override
    public void undo() {
        System.out.println("Error -> Sum has been already deposited, try to withdraw");
    }
}
