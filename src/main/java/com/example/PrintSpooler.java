package com.example;

public enum PrintSpooler {
    
    INSTANCE;
    
    private PrintSpooler() {}
    public static PrintSpooler getInstance(){
        return INSTANCE;
    }

    void print() {
        System.out.println("Printing...");
    }

}
