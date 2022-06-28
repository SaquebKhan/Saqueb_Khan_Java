package com.company;

public class Calculator {
    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        Calculator cal = new Calculator();
//        cal.multiply(2,4);
        int x = 2;
        int y = 4;
        System.out.println(x + "*" + y +"=" + cal.multiply(x, y));
    }
}
