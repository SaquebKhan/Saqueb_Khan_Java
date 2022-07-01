package com.company;

public class Farmer extends Character {

    public Farmer(String name) {
        super(name, 75, 100, 75, 10, 1);
    }

    public void plant() {
        System.out.println("Oh boy here I go planting again");
    }

    public void harvest() {
        System.out.println("Here comes the harvest");
    }

}
