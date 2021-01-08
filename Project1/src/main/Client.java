package main;

import commands.CommandType;
import commands.bank.RemoveCard;
import commands.online.ChangePassword;
import commands.Command;
import commands.bank.CreateCard;
import commands.atm.Deposit;
import commands.online.ExternTransfer;
import commands.online.InternTransfer;
import commands.atm.Withdraw;
import profile.Account;

import java.util.LinkedList;
import java.util.List;

public class Client {
    private Commander commander;
    private Account account;
    public List<Account> accountParteners;
    private String name;
    public static int id;

    public Client(String name, String birthDate, String gender) {
        this.commander = new Commander();
        this.account = new Account();
        this.name = name;
        this.account.setOwnerName(name);
        this.account.setBirthDate(birthDate);
        this.account.setGender(gender);
        this.account.id = this.id;
        this.id++;

    }

    public void addPartener(Account account) {
        if(accountParteners == null)
            accountParteners = new LinkedList<>();

        accountParteners.add(account);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void showAccount() {
        System.out.println("------");
        account.show();
    }

    public void newAccount() {
        account = new Account();
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<Account> getAccountParteners() {
        return accountParteners;
    }

    public void setAccountParteners(List<Account> accountParteners) {
        this.accountParteners = accountParteners;
    }

    public void executeAction(CommandType commandName, String ...args) {

        Command command;
        command = getCommand(commandName, args);
        commander.execute(command);

    }

    private Command getCommand(CommandType commandName, String ...args) {

        if(commandName.equals(CommandType.DEPOSIT))
            return new Deposit(account, args[0], args[1], args[2]);

        if(commandName.equals(CommandType.WITHDRAW))
            return new Withdraw(account, args[0], args[1], args[2]);

        if(commandName.equals(CommandType.INTERN_TRANSFER))
            return new InternTransfer(account, args[0], args[1], args[2], args[3]);

        if(commandName.equals(CommandType.CHANGE_PASSWORD))
            return new ChangePassword(account, args[0], args[1], args[2]);

        if(commandName.equals(CommandType.CREATE_CARD))
            return new CreateCard(account, name, args[0], args[1]);

        if(commandName.equals(CommandType.EXTERN_TRANSFER))
            return new ExternTransfer(account, accountParteners, args[0], args[1], args[2], args[3], args[4]);

        if(commandName.equals(CommandType.DESTROY_CARD))
            return new RemoveCard(account, args[0]);

        return null;
    }

    public void undo() {
        commander.undo();
    }
}
