package commands.online;

import commands.Command;
import profile.Account;
import cards.Card;


public class InternTransfer implements Command {
    private Account account;
    private int id1;
    private int id2;
    private double sum;
    private String password;

    public InternTransfer(Account account, String password, String id1, String id2, String sum) {
        this.account = account;
        this.id1 = Integer.parseInt(id1);
        this.id2 = Integer.parseInt(id2);
        this.sum = Integer.parseInt(sum);
        this.password = password;
    }


    @Override
    public void execute() {
        Card currentCard1 = account.getCard(id1);
        Card currentCard2 = account.getCard(id2);

        if (currentCard1.getPassword().equals(password)) {
            if (currentCard1.getFunds() >= sum) {
                currentCard1.setFunds(currentCard1.getFunds() - sum);
                currentCard2.setFunds(currentCard2.getFunds() + sum);
            } else {
                System.out.println("Error -> Insufficent funds");
            }
        } else {
            System.out.println("Error -> Wrong pin, try again");
        }
    }

    @Override
    public void undo() {
        Card currentCard1 = account.getCard(id1);
        Card currentCard2 = account.getCard(id2);
        currentCard1.setFunds(currentCard1.getFunds() + sum);
        currentCard2.setFunds(currentCard2.getFunds() - sum);
    }
}
