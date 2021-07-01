package com.darkside.banking_account_operation;

import com.darkside.banking_account.AbstractAccount;

import java.util.Scanner;

public class AddMoneyATMOperation implements  IBankingOperation {
    private final String message;
    private final AbstractAccount sourceCard;
    private final String enterCode;
    private final Scanner scanner;
    private static final String commission = "AddMoneyATMOperation";

    public AddMoneyATMOperation (Scanner scanner, String message, AbstractAccount sourceCard, String enterCode) {
        this.message = message;
        this.sourceCard = sourceCard;
        this.enterCode = enterCode;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.print(enterCode);
        int value = scanner.nextInt();
        if (value % 10 == 0)  {
            sourceCard.setSold(sourceCard.getSold() - sourceCard.getCommission(commission) + (double)value);
            System.out.println("Operation performed successfully.");
        } else {
            System.out.println("The amount must be a multiple of 10.");
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