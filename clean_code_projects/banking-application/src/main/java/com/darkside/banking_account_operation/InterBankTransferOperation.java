package com.darkside.banking_account_operation;

import com.darkside.banking_account.AbstractAccount;

import java.util.Scanner;

public class InterBankTransferOperation implements IBankingOperation {
    private final String message;
    private final AbstractAccount sourceCard;
    private final String enterCodeSum;
    private final String enterCodeIban;
    private final Scanner scanner;

    public InterBankTransferOperation (Scanner scanner, String message, AbstractAccount sourceCard, String enterCodeIban, String enterCodeSum) {
        this.message = message;
        this.sourceCard = sourceCard;
        this.enterCodeIban = enterCodeIban;
        this.enterCodeSum = enterCodeSum;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.print(enterCodeIban);
        String Iban = scanner.next();
        if (Iban.length() != 24) {
            System.out.println("Incorrect IBAN.");
            return;
        }
        System.out.println(enterCodeSum);
        double value = scanner.nextDouble();
        String commission = "InterBankTransfer";
        if ((sourceCard.getSold() - sourceCard.getCommission(commission) - value) >= 0) {
            sourceCard.setSold(sourceCard.getSold() - sourceCard.getCommission(commission) - value);
            System.out.println("Operation performed successfully.");
        } else {
            System.out.println("Insufficient sold.");
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
