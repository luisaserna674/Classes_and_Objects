package com.sofkau.ClassesAndObjects;

import java.util.Date;

/**
 * Description: Class that represents a person template
 */

public class Person {
    /**
     * Attributes or Properties from the class ♥
     */
    public String name, lastName1, lastName2;
    public Date datebirth;
    public float height;

    /**
     * ♥
     * Methods to set the person's name
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Method to get the person's name
     * @return
     */
    public String getName() {
        return name;
    }
}
