package com.darkside.banking_software;

import com.darkside.banking_account.AbstractAccount;
import com.darkside.banking_client.IBankClient;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DarkBank implements IBank {

    private List<IBankClient> clients = new ArrayList<>();
    private HashMap<String, Double> currencyes = new HashMap<>();
    private String name;
    private String bankId;

    public DarkBank(String name, String bankId) {
        this.name = name;
        this.bankId = bankId;
        currencyes.put("CHF", 4.5);
        currencyes.put("EUR", 4.9);
        currencyes.put("USD", 4.1);
        currencyes.put("GPB", 5.7);
    }

    private void copy(DarkBank bank) {
        this.name = bank.name;
        this.clients = bank.clients;
        this.bankId = bank.bankId;
        this.currencyes = bank.currencyes;
    }

    private static void log(String string) {
        System.out.println(string);
    }

    @Override
    public boolean cardExists(final String IBAN) {
        return clients.stream().anyMatch(client -> client.getCard(IBAN) != null);
    }

    @Override
    public AbstractAccount getCard(final String IBAN) {
        return clients.stream().filter(client -> client.getCard(IBAN) != null).findFirst().map(client -> client.getCard(IBAN)).orElse(null);
    }

    @Override
    public IBankClient getClient(final String clientID) {
        return clients.stream().filter(client -> client.getID().equals(clientID)).findFirst().orElse(null);
    }

    @Override
    public IBankClient getClient(AbstractAccount card) {
        return clients.stream().filter(client -> client.getCard(card.getIBAN()) != null).findFirst().orElse(null);
    }

    @Override
    public void addClient(IBankClient client) {
        clients.add(client);
    }

    @Override
    public boolean removeClient(String clientID) {
        return clients.removeIf(client -> (client.getID().equals(clientID)));
    }

    @Override
    public boolean existsCurrency(String currency) {
        return currencyes.containsKey(currency);
    }

    @Override
    public double getCurrency(String currency) {
        return currencyes.get(currency);
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "DarkBank{" +
                "clients=" + clients +
                ", currencyes=" + currencyes +
                ", name='" + name + '\'' +
                ", bankId='" + bankId + '\'' +
                '}';
    }

    private DarkBank getDarkBank() {
        return this;
    }
}
