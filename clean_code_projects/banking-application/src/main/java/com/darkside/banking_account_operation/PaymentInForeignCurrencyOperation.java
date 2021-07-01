package com.darkside.banking_account_operation;

import com.darkside.banking_account.AbstractAccount;
import com.darkside.banking_software.IBank;

import java.util.Scanner;

public class PaymentInForeignCurrencyOperation implements IBankingOperation {
    private final String message;
    private final AbstractAccount sourceCard;
    private final String enterSum;
    private final String enterIban;
    private final Scanner scanner;
    private final String enterCurrency;
    private final IBank bank;
    private static final String commission = "PaymentInForeignCurrency";

    public PaymentInForeignCurrencyOperation (Scanner scanner, String message, AbstractAccount sourceCard, String enterIban,
                                              String enterSum, IBank bank, String enterCurrency) {
        this.message = message;
        this.sourceCard = sourceCard;
        this.bank = bank;
        this.enterCurrency = enterCurrency;
        this.enterSum = enterSum;
        this.enterIban = enterIban;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        System.out.print(enterIban);
        String Iban = scanner.nextLine();
        if (Iban.length() != 24) {
            System.out.println("Incorrect IBAN.");
            return;
        }
        System.out.print(enterCurrency);
        String currency = scanner.nextLine();
        if (!bank.existsCurrency(currency)) {
            System.out.println("Incorrect currency.");
            return;
        }
        double exchange = bank.getCurrency(currency);
        System.out.println(enterSum);
        double value = scanner.nextDouble();
        value *= exchange;
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

