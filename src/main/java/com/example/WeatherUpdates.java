package com.example;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.ArrayList;
import java.util.List;

public class WeatherUpdates implements PropertyChangeListener {

    private List<String> weatherUpdates = new ArrayList<>();

    public void printUpdates() {
        weatherUpdates.forEach(System.out::println);
    }

    @Override
    public void propertyChange(PropertyChangeEvent event) {
        weatherUpdates.add((String) event.getNewValue());
    }
}
