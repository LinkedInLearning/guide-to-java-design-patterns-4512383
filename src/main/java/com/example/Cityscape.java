package com.example;

import java.util.List;

public class Cityscape {

    public static void main(String[] args) {

        BuildingType houseBuildingType = new BuildingType("House");
        Building house1 = new Building(21, houseBuildingType);
        Building house2 = new Building(21, houseBuildingType);
        Building house3 = new Building(21, houseBuildingType);
        Building house4 = new Building(21, houseBuildingType);
        Building house5 = new Building(21, houseBuildingType);


        BuildingType skyscraperBuildingType = new BuildingType("skyscraper");
        Building skyscraper1 = new Building(86, skyscraperBuildingType);
        Building skyscraper2 = new Building(86, skyscraperBuildingType);
        Building skyscraper3 = new Building(86, skyscraperBuildingType);
        Building skyscraper4 = new Building(86, skyscraperBuildingType);
        Building skyscraper5 = new Building(86, skyscraperBuildingType);

        List<Graphic> order = List.of(house1, house2, house3, house4, house5,
                skyscraper1, skyscraper2, skyscraper3, skyscraper4, skyscraper5);

        createCityscape(order);

    }

    private static void createCityscape(List<Graphic> graphics) {
        System.out.println("Order placed: " );
        graphics.forEach(System.out::println);
    }

}
