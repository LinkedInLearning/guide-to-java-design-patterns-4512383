package com.example;

public class App {

    public static void main(String[] args) {
        var englishLocalisedMessage = new EnglishLocalisedMessage();
        var englishGreeting = new Greeting(englishLocalisedMessage);
        englishGreeting.print();


        var frenchLocalisedMessage = new FrenchMessageAdapter();
        var frenchGreeting = new Greeting(frenchLocalisedMessage);
        frenchGreeting.print();
    }

}
