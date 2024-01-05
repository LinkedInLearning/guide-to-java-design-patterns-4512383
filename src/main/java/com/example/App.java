package com.example;

public class App {

    public static void main(String[] args) {

        Order order = new Order();

        var orderOperationExecutor = new OrderOperationExecutor();
        orderOperationExecutor.executeOperation(new PlaceOrderOperation(order));
        orderOperationExecutor.executeOperation(new CancelOrderOperation(order));

    }

}
