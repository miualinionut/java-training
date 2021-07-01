package com.darkside.banking_client;

import com.darkside.banking_account.AbstractAccount;

import java.io.Serializable;

public interface IBankClient extends Serializable {

    public String getID();

    public AbstractAccount getCard(final String IBAN);

    public String getName();

    public void addCard(AbstractAccount card);

    public boolean removeCard(final String IBAN);
}
