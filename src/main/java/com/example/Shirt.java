package com.example;

public class Shirt implements ClothingItem {

    private final Size size;

    public Shirt(Size size) {
        this.size = size;
    }

    @Override
    public void getType() {
        System.out.println("Shirt");
    }

    @Override
    public Size getSize() {
        return size;
    }
}
