package com.example;

public class Order {

    private String name;
    private boolean isPaidFor = false;

    public Order(String name) {
        this.name = name;
        System.out.println("One " + name + " ordered");
    }

    public void receivePayment() {
        this.isPaidFor = true;
    }

}
