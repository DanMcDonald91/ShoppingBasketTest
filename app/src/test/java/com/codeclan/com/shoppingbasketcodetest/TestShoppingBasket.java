package com.codeclan.com.shoppingbasketcodetest;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 17/03/2017.
 */

public class TestShoppingBasket {
    ShoppingBasket shoppingbasket;
    Bread bread;
    Jam jam;
    Chocolate chocolate;

    @Before
    public  void before() {
        shoppingbasket = new ShoppingBasket();
        bread = new Bread("Wrap", 2);
        chocolate = new Chocolate("Kitkat", 6);
    }

    @Test
    public void testAddItemToBasket() {
        shoppingbasket.addItem(bread);
        assertEquals(1,shoppingbasket.getNumbeOfItems());

    }

    @Test
    public void TestRemoveItemFromBasket() {
        shoppingbasket.addItem(bread);
        shoppingbasket.addItem(chocolate);
        shoppingbasket.removeItem(chocolate);
    }

    @Test
    public void TestEmptyBasket() {
        shoppingbasket.addItem(bread);
        shoppingbasket.addItem(chocolate);
        shoppingbasket.addItem(jam);
        shoppingbasket.emptyBasket();
        assertEquals(0, shoppingbasket.getNumbeOfItems());

    }

    @Test
    public void TestGetNumberItems() {
        shoppingbasket.addItem(bread);
        shoppingbasket.addItem(chocolate);
        assertEquals(2, shoppingbasket.getNumbeOfItems());
    }

    @Test
    public void TestTotalValue(){
        shoppingbasket.addItem(bread);
        shoppingbasket.addItem(jam);
        shoppingbasket.addItem(chocolate);
        assertEquals(3, shoppingbasket.totalPrice());
    }
}
