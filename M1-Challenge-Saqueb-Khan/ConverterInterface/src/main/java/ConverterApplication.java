package com.company.interface;

import com.company.ConverterIf;


public class ConverterApplication {
    public static void main(String[] args) {
        Converter converter1 = new ConverterIf();
        Converter converter2 = new ConverterSwitch();


        converter1.converMonth(1);
        int monthNumber = 1;
        converter1.converMounth(1);
        System.out.println((converter1.convertMonth(1));
        System.out.println((converter1.convertDay(1));
    }
}
