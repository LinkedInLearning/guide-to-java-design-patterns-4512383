package com.example;

public class BikeManufacturer {


    public static void main(String[] args) {
        Bike roadBike = buildBike("ROAD");
        Bike mountainBike = buildBike("MOUNTAIN");

        System.out.println(roadBike);
        System.out.println(mountainBike);

    }


    private static Bike buildBike(String bikeType) {
        var bikeFactory = FactoryMaker.createFactory(bikeType);
        var handlebars = bikeFactory.createHandlebars();
        var pedals = bikeFactory.createPedals();
        var frontTire = bikeFactory.createTire();
        var backTire = bikeFactory.createTire();
        return new Bike(handlebars, pedals, frontTire, backTire);
    }

}

