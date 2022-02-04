package com.sofkau.ClassesAndObjects;

import java.util.ArrayList;

/**
 * Description: This project consist in create several classes
 * with its attributes and methods.
 * @author Luisa Fernanda Serna ☺
 * @version 1.0
 * @since 02/02/2022
 */

public class Main {
    public static void main(String[] args) {
        //Fruit example
        Fruit Banana = new Fruit();
        Banana.name = "Banana";
        ArrayList<String> color = new ArrayList<String>();
        color.add("Green");
        color.add("Yellow");
        Banana.setColor(color);
        System.out.println(Banana.getColor());


    }
}
