package com.example;

public class App {

    public static void main(String[] args) {
        var englishLocalisedMessage = new EnglishLocalisedMessage();
        var greeting = new Greeting(englishLocalisedMessage);
        greeting.print();
    }

}
