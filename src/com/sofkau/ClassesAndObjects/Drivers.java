package com.sofkau.ClassesAndObjects;

import java.sql.Driver;

/**
 * Description: This class create drivers based on Person class attributes and overloading
 * new properties inside.
 */

public class Drivers extends Person{
    public int phoneNumber;
    protected int licenseNumber;
    private int idDocument;



    /**
     *  Method to get the Phone Number from the driver
     * @return the Phone Number
     */
    public int getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * Method to set the Document from the driver
     * @param idDocument
     */
    protected void setIdDocument(int idDocument) {
        this.idDocument = idDocument;
    }

    /**
     * Method to get the Driver's License Number from the driver
     *@return the Number
     */

    private int getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * This method just return a message calling a property from the class Person
     * @return
     */
    public String letsDrive(){
        Person person = new Person();
        return "Lets Drive" + person.name;
    }

}
