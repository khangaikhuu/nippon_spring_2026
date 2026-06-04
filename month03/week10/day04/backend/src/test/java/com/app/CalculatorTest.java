package com.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    
    @Test
    public void testAddMethod() {
        Calculator calc = new Calculator();
        
        // Assert: We expect 2 + 3 to equal 5
        assertEquals(5, calc.add(2, 3), "2 + 3 should equal 5");
        assertEquals(10, calc.add(5, 5), "5 + 5 should equal 10");
    }

    @Test
    public void testSubtractMethod(){
        Calculator calc= new Calculator();

        assertEquals(3, calc.subtract(6, 3), "6 - 3 should equal 3");
        assertEquals(7, calc.subtract(10, 3));
    }

    @Test
    public void testMultiplyMethod(){
        Calculator calc= new Calculator();

        assertEquals(18, calc.multiply(6, 3), "6 * 3 should equal 18");
        assertEquals(30, calc.multiply(10, 3));
    }


    @Test
    public void testDivideByZeroThrowsException() {
        Calculator calc = new Calculator();

        // Assert that dividing by 0 triggers an IllegalArgumentException
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(10, 0);
        });
    }
}
