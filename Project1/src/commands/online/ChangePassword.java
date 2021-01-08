package commands.online;

import commands.Command;
import profile.Account;
import cards.Card;

public class ChangePassword implements Command {
    private Account account;
    private int id;
    private String newPassword;
    private String oldPassword;
    private String password;

    public ChangePassword(Account account, String password, String id, String newPassword) {
        this.account = account;
        this.id = Integer.parseInt(id);
        this.newPassword = newPassword;
        this.password = password;
    }

    @Override
    public void execute() {

        Card currentCard = account.getCard(id);

        if (currentCard.getPassword().equals(password)) {
            if (newPassword.length() == 4) {

                oldPassword = newPassword;
                currentCard.setPassword(newPassword);
            } else {
                System.out.println("Error -> Password must be a 4 digit code");
            }
        } else {
            System.out.println("Error -> Wrong PIN, try again");
        }
    }

    @Override
    public void undo() {
        Card currentCard = account.getCard(id);
        currentCard.setPassword(oldPassword);
    }
}
