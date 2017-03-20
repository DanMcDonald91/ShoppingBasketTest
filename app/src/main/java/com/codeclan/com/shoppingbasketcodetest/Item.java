package com.codeclan.com.shoppingbasketcodetest;

/**
 * Created by user on 17/03/2017.
 */

public abstract class Item {

    // The item class has two fields

    public String name;
    public int price;


    // The item class has one constructor
    // Constructors are invoked to create objects from the class blueprint.

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // The item class has four methods

    public String getName() {
        return name;

    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}