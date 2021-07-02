package com.darkside.application;

import com.darkside.banking_account.AbstractAccount;
import com.darkside.banking_account.AccountBuilder;
import com.darkside.banking_client.BankClient;
import com.darkside.banking_client.IBankClient;
import com.darkside.banking_software.*;

import java.util.Scanner;

public class MainClass {

    public static void getData(IBank bank, IBankClient client, Scanner scanner) {
        client = new BankClient("0", "Logo");
        bank = new DarkBank("ING", "383838");
        AbstractAccount account = (new AccountBuilder().create("Basic", bank, scanner, "RO49AAAA1B31007593840000",
                "9934", 98937.90));
        client.addCard(account);
        bank.addClient(client);
        client = new BankClient("1", "Stoe");
        bank = new DarkBank("ING", "343434");
        account = (new AccountBuilder().create("Basic", bank, scanner, "RO88BACF1B31007593840560",
                "1234", 36.90));
        client.addCard(account);
        account = (new AccountBuilder().create("Silver", bank, scanner, "RO69PODI1B31007593890001",
                "1234", 4000));
        client.addCard(account);
        bank.addClient(client);
        client = new BankClient("2", "GB");
        bank = new DarkBank("ING", "39383");
        account = (new AccountBuilder().create("Gold", bank, scanner, "RO49AAZZ1B39484593840000",
                "2345", 637.90));
        client.addCard(account);
        bank.addClient(client);
        client = new BankClient("3", "Alex");
        bank = new DarkBank("ING", "888777");
        account = (new AccountBuilder().create("Silver", bank, scanner, "RO99XXXX1B31007593848765",
                "1275", 347.75));
        client.addCard(account);
        bank.addClient(client);
        client = new BankClient("4", "Georgi");
        bank = new DarkBank("ING", "901234");
        account = (new AccountBuilder().create("Basic", bank, scanner, "RO49QWER1B31007593867810",
                "1230", 6000));
        client.addCard(account);
        bank.addClient(client);
    }
    public static void main (String ... args) {
        IBankClient firstClient = new BankClient("5", "Andreea");
        IBank bank = new DarkBank("ING", "901234");
        Scanner scanner = new Scanner(System.in);
        MainClass.getData(bank, firstClient, scanner);
        AbstractAccount account = (new AccountBuilder().create("Basic", bank, scanner, "RO70PQWB1B31007593840000",
                "0001", 10.000));
        firstClient.addCard(account);
        bank.addClient(firstClient);
        IBankObject atm = new BankATM(bank, scanner);
        atm.startSession(account);
        atm = new MobileBankingApplication(bank, scanner);
        atm.startSession(account);
    }
 }
