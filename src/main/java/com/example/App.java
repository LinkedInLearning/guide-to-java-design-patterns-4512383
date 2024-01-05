package com.example;

public class App {

    public static void main(String[] args) {

        var message = "Hello World";
        var request = new LoggerRequest(message, LoggerRequest.LoggerType.FILE);
        Logger loggerChain = buildChain();
        loggerChain.log(request);

    }

    private static Logger buildChain() {
        var fileLogger = new FileLogger(null);
        var consoleLogger = new ConsoleLogger(fileLogger);
        return consoleLogger;
    }



}
