package com.edu.learning;

public class Car extends Vehicle implements Automatic, HasEngine {

    public Car(String brand) {
        super(brand);
    }

    // TODO
    // maxSpeed нь 200 буцаадаг болгоорой
    @Override
    int maxSpeed() {
        return 200;
    }

    @Override
    public boolean isAutomatic() {
        return true;
    }

    @Override
    public boolean hasEngine() {
        return true;
    }
}
