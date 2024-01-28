package com.example;

public interface FileSystemElement {

    String getName();

    void accept(Visitor visitor);

}
