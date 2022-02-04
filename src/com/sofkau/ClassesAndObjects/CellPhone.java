package com.sofkau.ClassesAndObjects;

import java.util.ArrayList;

/**
 * Description: This class is related to a cellphone object
 */

public class CellPhone {
    /**
     * Attributes
     */
    public String model;
    public int size;
    protected String buyerName;
    private String password;

    /**
     * Methods
     * Method to change the password. Works validating old password and then replacing the older one
     * @param password
     * @param newPassword
     * @return
     */
    protected boolean resetPassword(String password, String newPassword){
        if (password == this.password){
            this.password = newPassword;
            return true;
        }
        else {
            return false;
        }

    }

    /**
     * Method to return model property
     * @return the model value
     */

    public String getModel() {
        return model;
    }

    /**
     * Method to return buyer property
     * @return the buyer name
     */
    private String getBuyerName() {
        return buyerName;
    }
}
