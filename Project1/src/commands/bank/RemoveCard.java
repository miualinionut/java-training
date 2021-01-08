package commands.bank;

import cards.Card;
import commands.Command;
import profile.Account;

public class RemoveCard implements Command {

    private Account account;
    private int id;

    public RemoveCard(Account account, String id) {
        this.account = account;
        this.id = Integer.parseInt(id);
    }


    @Override
    public void execute() {
        Card currentCard = account.getCard(id);
        account.removeCard(currentCard);
    }

    @Override
    public void undo() {
        System.out.println("Error -> Card has benn already destroyed");
    }
}
