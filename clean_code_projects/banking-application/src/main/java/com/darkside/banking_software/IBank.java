package com.darkside.banking_software;

import com.darkside.banking_account.AbstractAccount;
import com.darkside.banking_client.IBankClient;

import java.io.Serializable;

public interface IBank extends Serializable {

    public boolean cardExists(final String IBAN);

    public AbstractAccount getCard(final String IBAN);

    public IBankClient getClient(final String clientID);

    public IBankClient getClient(final AbstractAccount card);

    public void addClient(IBankClient client);

    public boolean removeClient(final String clientID);

    public boolean existsCurrency(final String currency);

    public double getCurrency(final String currency);

    public String getName();

}
