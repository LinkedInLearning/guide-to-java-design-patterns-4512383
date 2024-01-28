package com.example;

import java.util.ArrayList;
import java.util.List;

public class Directory implements Element {

    private String name;
    private List<Element> elements = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addElement(Element element) {
        elements.add(element);
    }

    public List<Element> getElements() {
        return elements;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
//        for (Element e : this.elements) {
//            e.accept(visitor);
//        }
    }

}
