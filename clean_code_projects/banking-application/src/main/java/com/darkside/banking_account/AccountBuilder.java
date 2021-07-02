package com.darkside.banking_account;

import com.darkside.banking_software.IBank;

import java.io.Serializable;
import java.util.Scanner;

public class AccountBuilder implements Serializable {

    /**
     *
     * @param type a string representing the type of card to be created
     * @param bank an interface that represents the bank where the card will be created
     * @param scanner a scanner from which the data from the console will be read
     * @param IBAN a string that represents the IBAN of the account
     * @param pin a string that represents the PIN of the account
     * @param sold the innitial sold of the account
     * @return the account that will be created
     */
    public AbstractAccount create(String type, IBank bank, Scanner scanner, final String IBAN, String pin,
                                  final double sold) {
        IFactoryAccount builder;
        switch (type) {
            case "Basic":
                builder = new FactoryBasicAccount();
                break;
            case "Silver":
                builder = new FactorySilverAccount();
                break;
            case "Gold":
                builder = new FactoryGoldAccount();
                break;
            default:
                return null;
        }

        return builder.create(bank, scanner, IBAN, pin, bank.getName(), sold);
    }

}
