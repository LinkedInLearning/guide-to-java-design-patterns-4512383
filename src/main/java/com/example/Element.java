package com.example;

public interface Element {

//    String getName();
//    int getSize();

    void accept(Visitor visitor);

}
