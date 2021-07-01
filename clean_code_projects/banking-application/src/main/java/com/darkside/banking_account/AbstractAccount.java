package com.darkside.banking_account;

import com.darkside.banking_account_operation.IBankingOperation;

import java.io.Serializable;
import java.util.HashMap;

public class AbstractAccount implements Serializable {

    protected HashMap<Integer, IBankingOperation> operationsATM;
    protected HashMap<Integer, IBankingOperation> operationsOnline;
    protected HashMap<String, Double> commissions;
    protected final String IBAN;
    protected String pin = "0000";
    protected boolean isBlocked;
    protected final String bankName;
    protected double sold;
    protected String type;

    /**
     *
     * @param type a string representing the type of card
     * @param IBAN a string representing the account IBAN
     * @param bankName a string representing the name of the bank
     */
    AbstractAccount(String type, String IBAN, String bankName) {
        this.IBAN = IBAN;
        this.isBlocked = true;
        this.bankName = bankName;
        this.type = type;
        operationsATM = new HashMap<>();
        operationsOnline = new HashMap<>();
        commissions = new HashMap<>();
    }

    /**
     * a function for executing online operations
     * @param operationID the index of the operation to be executed
     */
    public void executeOperationOnline(int operationID) {
        if (operationsOnline.containsKey(operationID)) {
            operationsOnline.get(operationID).execute();
        } else {
            System.out.println("Incorrect option.");
        }
    }


    /**
     *  a function for executing ATM operations
     * @param operationID the index of the operation to be executed
     */
    public void executeOperationATM(int operationID) {
        if (operationsATM.containsKey(operationID)) {
            operationsATM.get(operationID).execute();
        } else {
            System.out.println("Incorrect option.");
        }
    }

    /**
     *
     * @return a string that represents the name of the bank
     */
    public String getBankName() {
        return bankName;
    }

    /**
     *
     * @param value a boolean value, which has the value true if the card is locked and the value false otherwise
     */
    public void setIsBlocked(boolean value) {
        isBlocked = value;
    }

    /**
     *
     * @return a string representing the account IBAN
     */
    public String getIBAN() {
        return IBAN;
    }

    /**
     *
     * @return a boolean value, which has the value true if the card is locked and the value false otherwise
     */
    public boolean isBlocked() {
        return isBlocked;
    }

    /**
     *
     * @param newPin a string representing the new card PIN
     */
    public void changePin(String newPin) {
        pin = newPin;
    }

    /**
     *
     * @param pin a string representing the pin with which the card pin will be compared.
     * @return a boolean value, which is true if the pin is valid
     */
    public boolean isValidPin(String pin) {
        return this.pin.equals(pin);
    }

    /**
     *
     * @param sold a parameter that will set the new balance value
     */
    public void setSold(double sold) {
        this.sold = sold;
    }

    /**
     *
     * @return a value that represents the sold value
     */
    public double getSold() {
        return sold;
    }

    /**
     *
     * @param commission a string representing the name of the commission type
     * @return returns the amount of commission applied for this type of commission
     */
    public double getCommission(String commission) {
        if (commissions.containsKey(commission)) {
            return commissions.get(commission);
        } else {
            return 0;
        }
    }

    /**
     * a function that adds a new commission to the list of commissions
     * @param name the name of the commission
     * @param value the value of the commission
     */
    public void addCommission(String name, double value) {
        commissions.put(name, value);
    }

    /**
     *
     * @param name the name of the commission to be removed
     * @return TRUE value if a commission was found that was removed, FALSE otherwise.
     */
    public boolean removeCommission(String name) {
        return commissions.remove(name) != null;
    }

    /**
     *
     * @param index the index of the operation to be added
     * @param operation the operation to be added
     */
    public void addOperationOnline(int index, IBankingOperation operation) {
        operationsOnline.put(index, operation);
    }

    /**
     *
     * @param index the index of the operation to be removed
     * @return a boolean value that represents if the operation was removed
     */
    public boolean removeOperationOnline(int index) {
        return (operationsOnline.remove(index) != null);
    }

    /**
     *
     * @param index the index of the operation to be added
     * @param operation the operation to be added
     */
    public void addOperationATM(int index, IBankingOperation operation) {
        operationsATM.put(index, operation);
    }

    /**
     *
     * @param index the index of the operation to be removed
     * @return a boolean value that represents if the operation was removed
     */
    public boolean removeOperationATM(int index) {
        return (operationsATM.remove(index) != null);
    }

    /**
     *
     * @param index the index of the operation returned
     * @return the desired operation or null value
     */
    public IBankingOperation getOperationATM(int index) {
        return operationsATM.getOrDefault(index, null);
    }

    /**
     *
     * @param index the index of the operation returned
     * @return the desired operation or null value
     */
    public IBankingOperation getOperationOnline(int index) {
        return operationsOnline.getOrDefault(index, null);
    }

    @Override
    public String toString() {
        return "AbstractAccount{" +
                "operationsATM=" + operationsATM +
                ", operationsOnline=" + operationsOnline +
                ", commissions=" + commissions +
                ", IBAN='" + IBAN + '\'' +
                ", pin='" + pin + '\'' +
                ", isBlocked=" + isBlocked +
                ", bankName='" + bankName + '\'' +
                ", sold=" + sold +
                ", type='" + type + '\'' +
                '}';
    }
}
