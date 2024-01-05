package com.example;

public class CancelOrderOperation implements OrderOperation {

    private final Order order;

    public CancelOrderOperation(Order order) {
        this.order = order;
    }

    @Override
    public void execute() {
        order.cancelOrder();
    }
}
