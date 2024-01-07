package com.example;

import java.util.Iterator;

public class CountryCollection implements Iterable<Country> {

    private final Country[] countries;

    public CountryCollection(Country... countries) {
        this.countries = countries;
    }

    public Country[] getCountries() {
        return countries;
    }

    @Override
    public Iterator<Country> iterator() {
        return new CountryIterator(this);
    }
}
