package com.example;

public class ImagePrinter {

    public void printImage() {
        var spooler = PrintSpooler.getInstance();
        spooler.print();
    }

}
