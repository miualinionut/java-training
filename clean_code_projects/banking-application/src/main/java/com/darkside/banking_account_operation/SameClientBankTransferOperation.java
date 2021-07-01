package com.darkside.banking_account_operation;

import com.darkside.banking_account.AbstractAccount;
import com.darkside.banking_client.IBankClient;
import com.darkside.banking_software.IBank;

import java.util.Scanner;

public class SameClientBankTransferOperation implements IBankingOperation {

    private final String message;
    private final AbstractAccount sourceCard;
    private final IBank bank;
    private final Scanner scanner;
    private final String enterIBAN;
    private final String enterValue;
    private static final String commission = "SameClientBankTransfer";

    public SameClientBankTransferOperation(String message, AbstractAccount sourceCard, IBank bank, Scanner scanner, String enterIBAN, String enterValue) {
        this.message = message;
        this.sourceCard = sourceCard;
        this.bank = bank;
        this.scanner = scanner;
        this.enterIBAN = enterIBAN;
        this.enterValue = enterValue;
    }

    @Override
    public void execute() {
        IBankClient client = bank.getClient(sourceCard);
        System.out.print(enterIBAN);
        final String IBAN = scanner.nextLine();
        if (IBAN.length() != 24) {
            System.out.println("Incorrect IBAN.");
            return;
        }

        System.out.println(enterValue);
        double value = scanner.nextDouble();
        AbstractAccount destinationCard = bank.getCard(IBAN);
        if(destinationCard == null || !client.getID().equals(bank.getClient(destinationCard).getID())) {
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
