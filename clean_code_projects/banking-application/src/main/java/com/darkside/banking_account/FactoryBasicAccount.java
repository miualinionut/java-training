package com.darkside.banking_account;

import com.darkside.banking_account_operation.*;
import com.darkside.banking_software.IBank;

import java.util.Scanner;

public class FactoryBasicAccount implements IFactoryAccount {

    /**
     *
     * @param bank an interface that represents the bank where the card will be created
     * @param scanner a scanner from which the data from the console will be read
     * @param IBAN a string that represents the IBAN of the account
     * @param pin a string that represents the PIN of the account
     * @param bankName a string that represents the name of the bank
     * @param sold the innitial sold of the account
     * @return the account that will be created
     */
    @Override
    public AbstractAccount create(IBank bank, Scanner scanner, String IBAN, String pin, String bankName, double sold) {
        AbstractAccount card = new AbstractAccount("Basic", IBAN, bankName);
        card.setSold(sold);
        card.changePin(pin);

        IBankingOperation operation = new ExitOperation("Exit.");
        card.addOperationATM(0, operation);
        card.addOperationOnline(0, operation);

        operation = new InterBankTransferOperation(scanner, "Interbank transfer.", card, "Enter IBAN: ", "Sum = ");
        card.addOperationATM(1, operation);
        card.addOperationOnline(1, operation);

        operation = new SameBankTransferOperation(scanner, "Transfer to a same bank account.", card, bank, "Enter IBAN: ", "Sum = ");
        card.addOperationATM(2, operation);
        card.addOperationOnline(2, operation);

        operation = new SameClientBankTransferOperation("Transfer to another account.", card,
                bank, scanner, "Enter IBAN: ", "Enter sum: ");
        card.addOperationOnline(3, operation);

        operation = new AddMoneyATMOperation(scanner, "Add money.", card, "Enter sum: ");
        card.addOperationATM(3, operation);

        operation = new WithdrawMoneyATMOperation(scanner, "Withdraw money.", card, "Enter sum: ");
        card.addOperationATM(4, operation);

        operation = new ViewSoldOperation("View sold.", card);
        card.addOperationATM(5, operation);
        card.addOperationOnline(4, operation);

        card.addCommission("InterBankTransfer", 5);
        card.setIsBlocked(false);
        return card;
    }
}
