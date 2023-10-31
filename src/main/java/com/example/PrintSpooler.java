package com.example;

public class PrintSpooler {

    private static PrintSpooler INSTANCE;

    private PrintSpooler() {}

    public static PrintSpooler getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new PrintSpooler();
        }
        return INSTANCE;
    }


    void print() {
        System.out.println("Printing...");
    }

}
