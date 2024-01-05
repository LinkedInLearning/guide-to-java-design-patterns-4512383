package com.example;

public class App {

    public static void main(String[] args) {

        var message = "Hello World";
        var request = new LoggerRequest(message, LoggerRequest.LoggerType.CONSOLE);
        Logger logger = new ConsoleLogger();
        logger.log(request);

    }

}
