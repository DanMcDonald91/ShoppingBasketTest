package com.codeclan.com.shoppingbasketcodetest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 17/03/2017.
 */

public class TestItem {

    Bread bread;
    Jam jam;
    Chocolate chocolate;

    @Before
    public void before(){
        bread = new Bread("Hovis", 3);
        jam = new Jam("Jammy" , 1);
        chocolate = new Chocolate("Twix", 6);
    }

    @Test
    public void testGetName() {
        assertEquals("Hovis", bread.getName());
    }

    @Test
    public void testSetName() {
        chocolate.setName("Aero");
        assertEquals("Aero", chocolate.getName());
    }

    @Test
    public void testGetPrice() {
        assertEquals(1, jam.getPrice());
    }

    @Test
    public void testSetPrice() {
        jam.setPrice(20);
        assertEquals(20, jam.getPrice());
    }


}
