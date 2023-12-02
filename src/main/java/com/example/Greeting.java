package com.example;

public class Greeting {

    private final LocalisedMessage localisedMessage;

    public Greeting(LocalisedMessage localisedMessage) {
        this.localisedMessage = localisedMessage;
    }

    public void print() {
        localisedMessage.sayHello();
    }


}
