package com.example;

public class RestaurantClosedState implements RestaurantState {

    @Override
    public void serveCustomer(Restaurant restaurant) {
        System.out.println("Restaurant is closed, not serving customer");
    }

}
