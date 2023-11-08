package com.example;

public class Bike {

    private Handlebars handlebars;
    private Pedals pedals;
    private Tire frontTire;
    private Tire backTire;

    public Bike(Handlebars handlebars, Pedals pedals, Tire frontTire, Tire backTire) {
        this.handlebars = handlebars;
        this.pedals = pedals;
        this.frontTire = frontTire;
        this.backTire = backTire;
    }

    public Handlebars getHandlebars() {
        return handlebars;
    }

    public Pedals getPedals() {
        return pedals;
    }

    public Tire getFrontTire() {
        return frontTire;
    }

    public Tire getBackTire() {
        return backTire;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "handlebars=" + handlebars.getType() +
                ", pedals=" + pedals.getType() +
                ", frontTire=" + frontTire.getWidth() +
                ", backTire=" + backTire.getWidth() +
                '}';
    }
}
