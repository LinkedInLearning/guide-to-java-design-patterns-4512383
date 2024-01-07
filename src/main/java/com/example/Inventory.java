package com.example;

import java.util.Iterator;

public class Inventory implements Iterable<Item> {

    private final Item[] items;

    public Inventory(Item... items) {
        this.items = items;
    }

    public Item[] getItems() {
        return this.items;
    }

    @Override
    public Iterator<Item> iterator() {
        return new StockIterator(this);
    }

}
