package com.sofkau.ClassesAndObjects;

/**
 * Description: This class is based on an account from a bank
 * where we can find some attributes and methods related to this class
 */

public class BankAccount {
    /**
     * Attributes
     */
     protected boolean activated;
     private boolean amount;
     private int accountNumber;

    /**
     * Method to set a value for activated property
     * @param activated
     */
    public void setActivated(boolean activated) {
        this.activated = activated;
    }

    /**
     * Method to get the value of activated property
     * @return
     */

    public boolean getActivated(){
        return activated;
    }

    /**
     * Method to set a value for Account Number property
     * @param accountNumber
     */

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * Method to get the value of Account Number property
     * @return
     */

    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Method to set a value for Amount property
     * @param amount
     */

    private void setAmount(boolean amount) {
        this.amount = amount;
    }

    /**
     * Method to get a value from Account property
     * @return
     */

    protected boolean getAmount() {
        return amount;
    }
}
