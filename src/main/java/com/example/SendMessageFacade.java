package com.example;

public class SendMessageFacade {

    public void sendMessage() {
        var client = new Client();
        client.connectToServer();

        var clientServer = new ClientServer();
        clientServer.authenticateClient();
        clientServer.routeToRecipient();

        var recipientServer = new RecipientServer();
        recipientServer.authenticateRecipient();
        recipientServer.sendMessage();

        var recipient = new Recipient();
        recipient.receiveMessage();
    }


}
