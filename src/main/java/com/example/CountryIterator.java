package com.example;

import java.util.Iterator;

public class CountryIterator implements Iterator<Country> {

    private final CountryCollection countryCollection;
    private int index;

    public CountryIterator(CountryCollection countryCollection) {
        this.countryCollection = countryCollection;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        var countryList = countryCollection.getCountries();
        return index < countryList.length;
    }

    @Override
    public Country next() {
        var countryList = countryCollection.getCountries();
        if (hasNext()) {
            return countryList[index++];
        } else {
            return null;
        }
    }
}
