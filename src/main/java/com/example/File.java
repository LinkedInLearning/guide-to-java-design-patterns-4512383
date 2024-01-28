package com.example;

public class File implements Element {

    private String name;
    private int size;

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }
}
