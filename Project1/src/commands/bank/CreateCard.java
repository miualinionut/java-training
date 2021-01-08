package commands.bank;

import commands.Command;
import profile.Account;
import cards.Card;
import factory.CardFactory;

public class CreateCard implements Command {
    private Account account;
    private Card card;
    private String ownerName;
    private String bankName;
    private String password;

    public CreateCard(Account account, String ownerName, String bankName, String password) {
        this.account = account;
        this.ownerName = ownerName;
        this.bankName = bankName;
        this.password = password;
    }

    @Override
    public void execute() {

        if (password.length() == 4) {
            CardFactory cardFactory = CardFactory.getInstance();
            card = cardFactory.getCard(bankName, ownerName, password);
            account.addCard(card);
        } else {
            System.out.println("Error -> Password must be a 4 digit code");
        }
    }

    @Override
    public void undo() {
        System.out.println("Error -> Card has been already created");
    }


}
