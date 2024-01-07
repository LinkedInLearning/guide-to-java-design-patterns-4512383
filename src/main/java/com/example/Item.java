package com.example;

public class Item {

    private final String name;
    private final int quantity;

    public Item(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }


    public int getQuantity() {
        return this.quantity;
    }
}
