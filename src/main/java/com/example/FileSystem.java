package com.example;

import java.util.ArrayList;
import java.util.List;

public class FileSystem implements Element {

    private String name = "FileSystem";

    private List<Element> elements = new ArrayList<>();

    @Override
    public String getName() {
        return name;
    }

    public void addElement(Element element) {
        elements.add(element);
    }

}
