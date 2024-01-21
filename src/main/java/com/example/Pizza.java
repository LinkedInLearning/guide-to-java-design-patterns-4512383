package com.example;

public abstract class Pizza {

    public void makeBase() {
        System.out.println("Mix flour, yeast and salt.");
        System.out.println("Roll out the dough.");
    }

    public abstract void addToppings();

    public void cook() {
        System.out.println("Cook in the oven for 20 minutes");
    }

}
