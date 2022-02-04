package com.sofkau.ClassesAndObjects;

import java.util.ArrayList;

public class Fruit {
    /**
     * Attributes
     */
    public String name;
    private float averageWeight;
    public ArrayList<String> color = new ArrayList<String>();

    /** Methods
     * This method sets the colors that a fruit can have
     * @param color
     */
    public void setColor(ArrayList<String> color) {
        this.color = color;
    }

    /**
     *
     * @return
     */
    public ArrayList<String> getColor() {
        return color;
    }

    /**
     * This method gets the colors of each fruit
     * @param averageWeight
     */
    public void setAverageWeight(float averageWeight) {
        this.averageWeight = averageWeight;
    }

    /**
     * This method gets the Average Weight that a fruit can have
     * @return
     */
    public float getAverageWeight() {
        return averageWeight;
    }

}
