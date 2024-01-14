package com.example;

public class Restaurant {

    private RestaurantState state = new RestaurantClosedState();

    public RestaurantState getState() {
        return state;
    }

    public void openRestaurant() {
        state = new RestaurantOpenState();
    }

    public void closeRestaurant() {
        state = new RestaurantClosedState();
    }

    public void serveCustomer() {
        state.serveCustomer(this);
    }


}
