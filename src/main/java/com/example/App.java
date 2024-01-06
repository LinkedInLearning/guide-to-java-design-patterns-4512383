package com.example;

public class App {

    public static void main(String[] args) {

        var item1 = new Item(1);
        var item2 = new Item(2);
        var item3 = new Item(3);

        var orderOperationExecutor = new ItemOperationExecutor();
        orderOperationExecutor.queueOperation(new AddItemToBasketOperation(item1));
        orderOperationExecutor.queueOperation(new AddItemToBasketOperation(item2));
        orderOperationExecutor.queueOperation(new AddItemToBasketOperation(item3));

        orderOperationExecutor.queueOperation(new RemoveItemFromBasketOperation(item2));

        orderOperationExecutor.checkout();
    }

}
