package com.darkside.banking_client;

import com.darkside.banking_account.AbstractAccount;

import java.util.ArrayList;
import java.util.List;

public class BankClient implements IBankClient {

    private List<AbstractAccount> cards = new ArrayList();
    private final String id;
    private String name;

    public BankClient(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public AbstractAccount getCard(String IBAN) {
        return cards.stream().filter(card -> card.getIBAN().equals(IBAN)).findFirst().orElse(null);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void addCard(AbstractAccount card) {
        cards.add(card);
    }

    @Override
    public boolean removeCard(String IBAN) {
        return cards.removeIf(card -> (card.getIBAN().equals(IBAN)));
    }

    @Override
    public String toString() {
        return "BankClient{" +
                "cards=" + cards +
                ", id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
