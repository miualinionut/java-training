package com.darkside.banking_account;

import com.darkside.banking_software.IBank;

import java.io.Serializable;
import java.util.Scanner;

/***
 * I used FactoryPattern
 * Through this creational design pattern, I solved the problem of creating objects without exposing the logical creation
 * to the client and referring to newly created object using a common interface.
 */
public interface IFactoryAccount extends Serializable {

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
    AbstractAccount create(IBank bank, Scanner scanner, final String IBAN, String pin, final String bankName, final double sold);

}
