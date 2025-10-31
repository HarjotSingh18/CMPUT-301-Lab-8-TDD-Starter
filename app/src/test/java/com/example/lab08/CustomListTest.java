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

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");

        list.addCity(calgary);
        list.addCity(edmonton);

        list.deleteCity(calgary);

        Assertions.assertFalse(list.hasCity(calgary));

        Assertions.assertTrue(list.hasCity(edmonton));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");

        list.addCity(calgary);
        list.addCity(edmonton);

        Assertions.assertEquals(2, list.countCities());

        list.deleteCity(calgary);

        Assertions.assertEquals(1, list.countCities());
    }



}
