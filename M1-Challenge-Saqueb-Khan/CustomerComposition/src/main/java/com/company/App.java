package com.company;

public class App {
    public static void main(String[] args) {

        // This is to put in a new customer in to the system

//    Billing information.
        Address billing = new Address("123", "S Street", "CityMcCityFace", "New Jersey", "54321");
//    Shipping information.
        Address shipping = new Address("789", "K Ave", "Town City", "California", "46290");
//    New Customer Details
        Customer sk = new Customer("Leeroy", "Jenkins", "l.Jenkins@yahoo.com", "8773934001", billing, shipping, true

        );

        System.out.println(sk);



    }
}
