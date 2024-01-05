package com.example;

public class PlaceOrderOperation implements OrderOperation {

    private final Order order;

    public PlaceOrderOperation(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.placeOrder();
    }
}
