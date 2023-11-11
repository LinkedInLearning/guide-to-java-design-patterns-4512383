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
            return new Bike(new RoadBikeHandlebars(), new RoadBikePedals(), new RoadBikeTire(), new RoadBikeTire());
        } else if (bikeType.equalsIgnoreCase("MOUNTAIN")) {
            return new Bike(new MountainBikeHandlebars(), new MountainBikePedals(), new MountainBikeTire(), new MountainBikeTire());
        } else {
            throw new IllegalArgumentException("Bike type not supported");
        }

    }

}

