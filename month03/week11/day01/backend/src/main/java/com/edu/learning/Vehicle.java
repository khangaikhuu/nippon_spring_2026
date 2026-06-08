package com.edu.learning;

abstract class Vehicle {

    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    abstract int maxSpeed();

    void describe() {
        System.out.println(brand + " — max " + maxSpeed() + " km/h");
    }
}
