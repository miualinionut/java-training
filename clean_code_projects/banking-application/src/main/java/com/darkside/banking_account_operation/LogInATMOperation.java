package com.darkside.banking_account_operation;

import com.darkside.banking_account.AbstractAccount;
import com.darkside.banking_software.IBank;

import java.util.Scanner;

public class LogInATMOperation implements IBankingOperation {

    private final String message;
    private final AbstractAccount sourceCard;
    private final Scanner scanner;
    private final IBank bank;

    public LogInATMOperation(String message, AbstractAccount sourceCard, Scanner scanner, IBank bank) {
        this.message = message;
        this.sourceCard = sourceCard;
        this.scanner = scanner;
        this.bank = bank;
    }

    @Override
    public void execute() {
        if (sourceCard.isBlocked()) {
            System.out.println("This card is blocked.");
            return;
        }
        System.out.println("Welcome to the " + bank.getName() + " ATM session.");
        if (!bank.getName().equals(sourceCard.getBankName())) {
            System.out.println("At the moment, the ATM does not accept cards from other banks.");
        }
        String enterPin = "Enter PIN: ";
        System.out.print(enterPin);
        String pin = scanner.next();
        if (!(sourceCard.isValidPin(pin))) {
            System.out.println("Invalid  PIN !!!.\n You have 2 more attempts before blocking the card.");
            System.out.print(enterPin);
            pin = scanner.next();
            if (!(sourceCard.isValidPin(pin))) {
                System.out.println("Invalid  PIN !!!.\n You have 1 more attempts before blocking the card.");
                System.out.print(enterPin);
                pin = scanner.next();
                if (!(sourceCard.isValidPin(pin))) {
                    System.out.println("Invalid  PIN !!!.\n The card has been blocked.");
                    sourceCard.setIsBlocked(true);
                } else {
                    IBankingOperation atmOperation = new BankATMOperation("", sourceCard, scanner);
                    atmOperation.execute();
                }
            } else {
                IBankingOperation atmOperation = new BankATMOperation("", sourceCard, scanner);
                atmOperation.execute();
            }
        } else {
            IBankingOperation atmOperation = new BankATMOperation("", sourceCard, scanner);
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
