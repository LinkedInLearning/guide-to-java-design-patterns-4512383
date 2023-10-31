package com.example;

public class DocumentPrinter {

    public void printImage() {
        var spooler = PrintSpooler.getInstance();
        spooler.print();
    }



}
