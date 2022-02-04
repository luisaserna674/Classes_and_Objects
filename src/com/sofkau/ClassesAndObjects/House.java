package com.sofkau.ClassesAndObjects;

/***
 * Description: This class represents a house object
 */

public class House {
    /**
     * Attributes
     */
    public float size;
    public int rooms;
    public String color;
    private String ownerName;
    protected String location;

    /**
     * Method to get the house's size
     * @return
     */
    public float getSize() {
        return size;
    }

    /**
     * Method to get the owner of the house
     * @return
     */

    private String getOwnerName() {
        return ownerName;
    }

    /**
     * Method to set the house's location
     * @param location
     */
    protected void setLocation(String location) {
        this.location = location;
    }
}
