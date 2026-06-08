package com.edu.learning;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



public class VehicleTest {
    
    @Test
    public void testCarInitializationAndSpeed(){

        Car car = new Car("Toyota");
        Assertions.assertEquals(200, car.maxSpeed(), "Car must return a max speed of 200.");
        Assertions.assertTrue(car.isAutomatic());
    }
    // test the bike
    @Test
    public void testBikeInitializationAndSpeed(){
        Bike bike = new Bike("Mountain Bike");
        Assertions.assertEquals(120, bike.maxSpeed(), "Bike must return a max speed of 120");
        Assertions.assertFalse(bike.isAutomatic());
    }
}
