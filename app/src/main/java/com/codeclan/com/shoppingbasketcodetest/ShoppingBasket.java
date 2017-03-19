package com.codeclan.com.shoppingbasketcodetest;

import java.util.ArrayList;

/**
 * Created by user on 17/03/2017.
 */

public class ShoppingBasket {

    protected ArrayList<Item> items;

    public ShoppingBasket() {
        this.items = new ArrayList<Item>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void RemoveItem(Item item) {
        items.remove(item);
    }

    public void EmptyBasket(Item item) {
        items.clear();
    }

    public int getNumbeOfItems() {
        return items.size();
    }
}
g