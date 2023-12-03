package com.example;

public class App {

    public static void main(String[] args) {
        var hoodie = new Hoodie(new ChildSize());
        hoodie.getType();
        hoodie.getSize().get();

        var shirt = new Shirt(new AdultSize());
        shirt.getType();
        shirt.getSize().get();
    }

}
