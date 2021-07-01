package com.darkside.banking_account_operation;

import com.darkside.banking_account.AbstractAccount;

import java.util.Scanner;

public class BankOnlineOperation implements IBankingOperation {

    private final String message;
    private final AbstractAccount account;
    private final Scanner scanner;

    public BankOnlineOperation(String message, AbstractAccount account, Scanner scanner) {
        this.message = message;
        this.account = account;
        this.scanner = scanner;
    }

    @Override
    public void execute() {
        int operationID = 0;
        IBankingOperation op = account.getOperationOnline(operationID);
        System.out.println("Available operations:");
        while (op != null) {
            System.out.println(operationID + ". " + op.getMessage());
            operationID++;
            op = account.getOperationOnline(operationID);
        }
        System.out.print("Option: ");
        int option = scanner.nextInt();
        if(option >= operationID) {
            System.out.println("Incorrect option.");
        }
        account.getOperationOnline(option).execute();
        System.out.println();
        if (account.getOperationOnline(option).isContinue()) {
            this.execute();
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
