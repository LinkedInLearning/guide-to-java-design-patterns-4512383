package com.example;

public class RoadBikeFactory implements BikeFactory {
    @Override
    public Handlebars createHandlebar() {
        return new RoadBikeHandlebars();
    }

    @Override
    public Pedals createPedals() {
        return new RoadBikePedals();
    }

    @Override
    public Tire createTire() {
        return new RoadBikeTire();
    }
}
