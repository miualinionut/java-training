package com.darkside.banking_account_operation;

import com.darkside.banking_account.AbstractAccount;

public class ViewSoldOperation implements  IBankingOperation {
    private final String message;
    private final AbstractAccount sourceCard;

    public ViewSoldOperation (String message, AbstractAccount sourceCard) {
        this.message = message;
        this.sourceCard = sourceCard;
    }

    @Override
    public void execute() {
        System.out.println("Sold: " + sourceCard.getSold() + " lei.\n");
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
