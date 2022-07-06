package com.company;

public class ConverterApplication {

    public static void main(String[] args) {

        Converter converterSwitch = new ConverterSwitch();
        System.out.println(converterSwitch.convertDay(2));
        System.out.println(converterSwitch.convertMonth(3));

        Converter converterIf = new ConverterIf();
        System.out.println(converterIf.convertDay(1));
        System.out.println(converterIf.convertMonth(3));

    }


}
