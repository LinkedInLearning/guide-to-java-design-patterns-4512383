package com.example;

public class OnlineStore {

    public static void main(String[] args) {
        var item1 = new Item(1);
        var item2 = new Item(2);
        var item3 = new Item(3);

        var itemOperationExecutor = new ItemOperationExecutor();
        itemOperationExecutor.doOperation(new AddItemToBasketOperation(item1));
        itemOperationExecutor.doOperation(new AddItemToBasketOperation(item2));
        itemOperationExecutor.doOperation(new AddItemToBasketOperation(item3));
        itemOperationExecutor.doOperation(new RemoveItemFromBasketOperation(item2));
    }

}
