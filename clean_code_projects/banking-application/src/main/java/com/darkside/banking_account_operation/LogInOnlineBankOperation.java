package com.darkside.banking_account_operation;

import com.darkside.banking_account.AbstractAccount;

import java.util.Scanner;

public class LogInOnlineBankOperation implements IBankingOperation {

    private final String message;
    private final AbstractAccount sourceAccount;
    private final Scanner scanner;

    public LogInOnlineBankOperation(String message, AbstractAccount sourceCard, Scanner scanner) {
        this.message = message;
        this.sourceAccount = sourceCard;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        if (sourceAccount.isBlocked()) {
            System.out.println("This account is blocked.");
            return;
        }
        System.out.println("Welcome to the online session.");
        String enterPassword = "Enter password: ";
        System.out.print(enterPassword);
        String password = scanner.next();
        if (!(sourceAccount.isValidPin(password))) {
            System.out.println("Invalid password !!!.\n You have 2 more attempts before blocking the account.");
            System.out.print(enterPassword);
            password = scanner.next();
            if (!(sourceAccount.isValidPin(password))) {
                System.out.println("Invalid  password !!!.\n You have 1 more attempts before blocking the account.");
                System.out.print(enterPassword);
                password = scanner.next();
                if (!(sourceAccount.isValidPin(password))) {
                    System.out.println("Invalid  password !!!.\n The account has been blocked.");
                    sourceAccount.setIsBlocked(true);
                } else {
                    IBankingOperation atmOperation = new BankATMOperation("", sourceAccount, scanner);
                    atmOperation.execute();
                }
            } else {
                IBankingOperation atmOperation = new BankATMOperation("", sourceAccount, scanner);
                atmOperation.execute();
            }
        } else {
            IBankingOperation atmOperation = new BankATMOperation("", sourceAccount, scanner);
            atmOperation.execute();
        }
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public boolean isContinue() {
        return true;
    }
}
