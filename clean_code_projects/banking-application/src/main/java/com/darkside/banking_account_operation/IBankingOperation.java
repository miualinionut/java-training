package com.darkside.banking_account_operation;

import java.io.Serializable;

/***
 * I used CommandPattern
 * Through this behavioral design pattern, I solved the problem of the need to issue requests to objects without knowing
 * anything about the requested operation or the recipient of the request.
 */
public interface IBankingOperation extends Serializable {

    public void execute();

    public String getMessage();

    public boolean isContinue();

}
