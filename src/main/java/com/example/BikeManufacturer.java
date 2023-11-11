package com.example;

public class BikeManufacturer {


    public static void main(String[] args) {
        Bike roadBike = buildBike("ROAD");
        Bike mountainBike = buildBike("MOUNTAIN");

        System.out.println(roadBike);
        System.out.println(mountainBike);

    }


    private static Bike buildBike(String bikeType) {
        if (bikeType.equalsIgnoreCase("ROAD")) {
            var roadBikeFactory = new RoadBikeFactory();
            var handlebars = roadBikeFactory.createHandlebars();
            var pedals = roadBikeFactory.createPedals();
            var frontTire = roadBikeFactory.createTire();
            var backTire = roadBikeFactory.createTire();
            return new Bike(handlebars, pedals, frontTire, backTire);
        } else if (bikeType.equalsIgnoreCase("MOUNTAIN")) {
            var mountainBikeFactory = new MountainBikeFactory();
            var handlebars = mountainBikeFactory.createHandlebars();
            var pedals = mountainBikeFactory.createPedals();
            var frontTire = mountainBikeFactory.createTire();
            var backTire = mountainBikeFactory.createTire();
            return new Bike(handlebars, pedals, frontTire, backTire);
        } else {
            throw new IllegalArgumentException("Bike type not supported");
        }
    }

}

