package com.company;

public class Constable extends Character{

    private String jurisdiction;

    public Constable(String name, String jurisdiction) {
        super(name, 60, 100, 60, 20, 5);
        this.jurisdiction = jurisdiction;
    }

    public void arrest(Character enemy) {
        System.out.format("Hault! You are under arrest! ", enemy.getName());
    }

    public String getJurisdiction() {
        return jurisdiction;
    }

}