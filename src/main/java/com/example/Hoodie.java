package com.example;

public class Hoodie implements ClothingItem {

    private final Size size;

    public Hoodie(Size size) {
        this.size = size;
    }
    @Override
    public void getType() {
        System.out.println("Hoodie");
    }

    @Override
    public Size getSize() {
        return size;
    }
}
