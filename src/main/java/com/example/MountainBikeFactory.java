package com.example;

public class MountainBikeFactory implements BikeFactory {


    @Override
    public Handlebars createHandlebar() {
        return new MountainBikeHandlebars();
    }

    @Override
    public Pedals createPedals() {
        return new MountainBikePedals();
    }

    @Override
    public Tire createTire() {
        return new MountainBikeTire();
    }
}
