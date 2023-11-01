package com.example;

public enum PrintSpooler {

    INSTANCE;

    private PrintSpooler() {}

    public synchronized static PrintSpooler getInstance() {
        return INSTANCE;
    }


    void print() {
        System.out.println("Printing...");
    }

}
