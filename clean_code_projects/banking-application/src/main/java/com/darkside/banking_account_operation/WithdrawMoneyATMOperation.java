package com.darkside.banking_account_operation;

import com.darkside.banking_account.AbstractAccount;

import java.util.Scanner;

public class WithdrawMoneyATMOperation implements IBankingOperation {
        private final String message;
        private final AbstractAccount sourceCard;
        private final String enterCode;
        private final Scanner scanner;
        private static final String commission = "WithdrawMoneyATM";

        public WithdrawMoneyATMOperation (Scanner scanner, String message, AbstractAccount sourceCard, String enterCode) {
            this.message = message;
            this.sourceCard = sourceCard;
            this.enterCode = enterCode;
            this.scanner = scanner;
        }

        @Override
        public void execute() {
            System.out.print(enterCode);
            double value = scanner.nextDouble();
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