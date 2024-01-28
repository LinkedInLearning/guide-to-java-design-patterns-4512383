package com.example;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Element {

    private String name;
    private List<Element> elements = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    public void addElement(Element element) {
        elements.add(element);
    }

}
