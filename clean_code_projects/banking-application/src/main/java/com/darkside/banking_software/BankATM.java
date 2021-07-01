package com.darkside.banking_software;

import com.darkside.banking_account.AbstractAccount;
import com.darkside.banking_account_operation.IBankingOperation;
import com.darkside.banking_account_operation.LogInATMOperation;

import java.util.Scanner;

public class BankATM implements IBankObject {

    private final IBank bank;
    private final Scanner scanner;

    public BankATM(IBank bank, Scanner scanner) {
        this.bank = bank;
        this.scanner = scanner;
    }

    @Override
    public void startSession(AbstractAccount account) {
        IBankingOperation op = new LogInATMOperation("", account, scanner, bank);
        op.execute();
    }
}
