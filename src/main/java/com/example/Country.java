package com.example;

public class Country {

    private final String name;
    private final String continent;

    public Country(String name, String continent) {
        this.name = name;
        this.continent = continent;
    }

    public String getName() {
        return this.name;
    }


    public String getContinent() {
        return this.continent;
    }
}
