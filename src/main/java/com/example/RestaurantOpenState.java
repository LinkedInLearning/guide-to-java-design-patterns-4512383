package com.example;

public class RestaurantOpenState implements RestaurantState {
    @Override
    public void serveCustomer(Restaurant restaurant) {
        System.out.println("Serving customer");
    }
}
