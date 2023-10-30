package com.example;

public class StoreItem

{
    private final String name;
    private final Double price;
    private final String shortDescription;
    private final String longDescription;
    private final Integer stockAvailable;
    private final String packagingType;

    public StoreItem(String name, Double price, String shortDescription, String longDescription,
                     Integer stockAvailable, String packagingType) {
        this.name = name;
        this.price = price;
        this.shortDescription = shortDescription;
        this.longDescription = longDescription;
        this.stockAvailable = stockAvailable;
        this.packagingType = packagingType;
        if (name == null || price == null) {
            throw new IllegalArgumentException("Name and price must not be null");
        }
    }

    @Override
    public String toString() {
        return "StoreItem{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", shortDescription='" + shortDescription + '\'' +
                ", longDescription='" + longDescription + '\'' +
                ", stockAvailable=" + stockAvailable +
                ", packagingType='" + packagingType + '\'' +
                '}';
    }
}
