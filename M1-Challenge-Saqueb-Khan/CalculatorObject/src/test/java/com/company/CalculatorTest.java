package com.company;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator cal;

    @Before
    public void setUp() throws Exception {
        cal = new Calculator();
    }

    @Test
    public void shouldAddInt() {
        assertEquals(2, cal.add(1,1));
        assertEquals(2, cal.add(10,-8));

    }

    @Test
    public void shouldAddDouble() {
        assertEquals(5.7, cal.add(3.4,2.3),.01);
        assertEquals(19.4, cal.add(17.3,2.1),.01);

    }

    @Test
    public void shouldSubtractInt() {
        assertEquals(-29, cal.subtract(23, 52));
        assertEquals(9, cal.subtract(19, 10));

    }

    @Test
    public void shouldMultiplyInt() {
        assertEquals(68, cal.multiply(34, 2));
        assertEquals(-8, cal.multiply(4, -2));
    }

    @Test
    public void shouldDivideInt() {
        assertEquals(4, cal.divide(12,3));
        assertEquals(1.0, cal.divide(12, 7), 0.01);
    }


    @Test
    public void shouldSubtractDouble() {
        assertEquals(5.0, cal.subtract(5.5,0.5),0.01);
        assertEquals(7.2, cal.subtract(10.9,3.7),0.01);
    }



    @Test
    public void shouldMultiplyDouble() {
        assertEquals(29.4, cal.multiply(6.7,4.4),0.1);
        assertEquals(8.4, cal.multiply(2.1,4),0.1);

    }


    @Test
    public void shouldDivideIntAndReturnDouble() {
        assertEquals(4.9, cal.divide(10.8, 2.2),0.01);
    }


}