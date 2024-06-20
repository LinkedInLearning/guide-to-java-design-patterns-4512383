package com.example;

public class PrintSpooler {

    private PrintSpooler(){}
    private static PrintSpooler INSTANCE;

    void print() {
        System.out.println("Printing...");
    }

}
