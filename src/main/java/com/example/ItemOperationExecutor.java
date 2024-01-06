package com.example;

import java.util.ArrayList;
import java.util.List;

public class ItemOperationExecutor {

    List<ItemOperation> itemOperations = new ArrayList<>();

    public void queueOperation(ItemOperation itemOperation) {
        itemOperations.add(itemOperation);
    }

    public void checkout() {
        itemOperations.forEach(ItemOperation::execute);
        itemOperations.clear();
    }



}
