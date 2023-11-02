package com.example;

public class Pizza extends Meal {

    public Pizza(int price, String flavour) {
        super(price);
        this.flavour = flavour;
    }

    private String flavour;

    public String getFlavour() {
        return flavour;
    }

    public void setFlavour(String flavour) {
        this.flavour = flavour;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "price='" + super.getPrice() + '\'' +
                "flavour='" + flavour + '\'' +
                '}';
    }

    @Override
    public Meal clone() {
        return new Pizza(this.getPrice(), this.getFlavour());
    }
}
