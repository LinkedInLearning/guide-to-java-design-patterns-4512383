package com.example;

public class Building extends Graphic {

    private BuildingType buildingType;

    public Building(int heightInPixels, BuildingType buildingType) {
        super(heightInPixels);
        this.buildingType = buildingType;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }

    public void setBuildingType(BuildingType buildingType) {
        this.buildingType = buildingType;
    }


    @Override
    public String toString() {
        return "Building{" +
                "height in pixels='" + super.getHeightInPixels() + '\'' +
                "building type='" + buildingType + '\'' +
                '}';
    }

}
