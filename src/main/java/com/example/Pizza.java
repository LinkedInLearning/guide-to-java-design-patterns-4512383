package com.example;

public class Pizza extends Meal {

    private PizzaFlavour flavour;

    public Pizza(int price, PizzaFlavour flavour) {
        super(price);
        this.flavour = flavour;
    }

    public PizzaFlavour getFlavour() {
        return flavour;
    }

    public void setFlavour(PizzaFlavour flavour) {
        this.flavour = flavour;
    }


    @Override
    public String toString() {
        return "Pizza{" +
                "price='" + super.getPrice() + '\'' +
                "flavour='" + flavour + '\'' +
                '}';
    }

}
