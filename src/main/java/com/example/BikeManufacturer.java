package com.example;

public class BikeManufacturer {


    public static void main(String[] args) {
        Bike roadBike = buildBike("ROAD");
        Bike mountainBike = buildBike("MOUNTAIN");

        System.out.println(roadBike);
        System.out.println(mountainBike);

    }


    private static Bike buildBike(String bikeType) {
        BikeFactory bikeFactory = FactoryMaker.createFactory(bikeType);
        Handlebars handlebars = bikeFactory.createHandlebar();
        Pedals pedals = bikeFactory.createPedals();
        Tire frontTire = bikeFactory.createTire();
        Tire backTire = bikeFactory.createTire();
        return new Bike(handlebars, pedals, frontTire, backTire);
    }

}

