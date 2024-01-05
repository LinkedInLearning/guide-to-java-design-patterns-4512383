package com.example;

public class App {

    public static void main(String[] args) {

        var message = "Hello World";
        var request = new LoggerRequest(message, LoggerRequest.LoggerType.CONSOLE);
        Logger logger = buildLoggerChain();
        logger.log(request);

    }

    private static Logger buildLoggerChain() {
        var fileLogger = new FileLogger(null);
        var consoleLogger = new ConsoleLogger(fileLogger);
        return consoleLogger;
    }



}
