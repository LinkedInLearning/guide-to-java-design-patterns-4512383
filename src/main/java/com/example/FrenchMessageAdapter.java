package com.example;

public class FrenchMessageAdapter implements LocalisedMessage {

    private final FrenchLocalisedMessage frenchLocalisedMessage;

    public FrenchMessageAdapter() {
        this.frenchLocalisedMessage = new FrenchLocalisedMessage();
    }

    @Override
    public void sayHello() {
        frenchLocalisedMessage.sayBonjour();
    }

}
