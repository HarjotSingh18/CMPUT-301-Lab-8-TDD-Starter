package com.example.lab08;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CustomListTest{

    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Cagary", "AB");
        list.addCity(calgary);
        Assertions.assertTrue(list.hasCity(calgary));
    }
}
