package com.app;

public class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b){
        return a -b;
    }
//    TODO
    // create multiplication function
    // expect int return value
    // parameters int a, int b
    // Test the method with 2 test cases
    public int multiply(int a, int b){
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero!");
        }
        return a / b;
    }
}
