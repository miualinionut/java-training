package com.darkside.banking_account_operation;

import com.darkside.banking_account.AbstractAccount;
import com.darkside.banking_software.IBank;

import java.util.Scanner;

public class SameBankTransferOperation implements IBankingOperation {

    private final String message;
    private final AbstractAccount sourceCard;
    private final IBank bank;
    private final Scanner scanner;
    private final String enterIBAN;
    private final String enterValue;
    private static final String commission = "SameBankTransfer";

    public SameBankTransferOperation (Scanner scanner, String message, AbstractAccount sourceCard, IBank bank, String enterIBAN,
                                      String enterValue) {
        this.message = message;
        this.sourceCard = sourceCard;
        this.bank = bank;
        this.scanner = scanner;
        this.enterIBAN = enterIBAN;
        this.enterValue = enterValue;
    }

    @Override
    public void execute() {
        System.out.print(enterIBAN);
        final String IBAN = scanner.nextLine();
        if (IBAN.length() != 24) {
            System.out.println("Incorrect IBAN.");
            return;
        }

        System.out.println(enterValue);
        double value = scanner.nextDouble();
        AbstractAccount destinationCard = bank.getCard(IBAN);
        if(destinationCard == null) {
            System.out.println("Incorrect IBAN.");
            return;
        }
        if ((sourceCard.getSold() - sourceCard.getCommission(commission) - value) >= 0) {
            destinationCard.setSold(destinationCard.getSold() + value);
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
