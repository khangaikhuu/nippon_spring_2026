package com.edu.learning;

public class Bike extends Vehicle implements Automatic, HasEngine{

	Bike(String brand) {
		super(brand);
	}

    // TODO
    // maxSpeed нь 120 буцаадаг болгоорой
    @Override
    int maxSpeed() {
        return 120;
    }

    @Override
    public boolean isAutomatic() {
        return false;
    }

    @Override
    public boolean hasEngine() {
        return false;
    }
}
