package com.darkside.banking_account_operation;

public class ExitOperation implements IBankingOperation {

    private final String message;

    public ExitOperation(String message) {
        this.message = message;
    }

    @Override
    public void execute() {
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public boolean isContinue() {
        return false;
    }
}
