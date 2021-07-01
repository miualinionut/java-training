package com.darkside.banking_software;

import com.darkside.banking_account.AbstractAccount;
import com.darkside.banking_account_operation.IBankingOperation;
import com.darkside.banking_account_operation.LogInOnlineBankOperation;

import java.util.Scanner;

public class MobileBankingApplication implements IBankObject {

    private final IBank bank;
    private final Scanner scanner;

    public MobileBankingApplication(IBank bank, Scanner scanner) {
        this.bank = bank;
        this.scanner = scanner;
    }

    @Override
    public void startSession(AbstractAccount account) {
        IBankingOperation op = new LogInOnlineBankOperation("", account, scanner);
        op.execute();
    }
}
